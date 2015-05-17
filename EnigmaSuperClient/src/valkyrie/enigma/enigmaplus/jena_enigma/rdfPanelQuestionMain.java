package valkyrie.enigma.enigmaplus.jena_enigma;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.util.FileManager;

public class rdfPanelQuestionMain {

    public void rdfQuestionMain() {

        String uid = "";
        String qid = "";
        FileManager.get().addLocatorClassLoader(rdfPanelQuestionMain.class.getClassLoader());
        Model model = FileManager.get().loadModel("/Users/avinda/Desktop/ishara/jena_Enigma/jena_Enigma/src/jena_enigma/enigmardf.rdf");
        String queryString = "PREFIX sep: <http://www.semanticweb.org/hesh/ontologies/valkyrie/enigmaplus/ontology#>"
                + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
                + "PREFIX strg: <http://www.w3.org/2001/XMLSchema#string#>"
                + "SELECT *"
                + "WHERE {"
                + "?Question sep:qdate ?y .{"
                + "SELECT (MAX(?z) AS ?y) "
                + "WHERE {"
                + "?Question sep:qdate ?z . }"
                + "}"
                
                + "?Question sep:uid ?u ."//question title, question short, date, user, rate
                + "?Question sep:title ?t ."
                + "?Question sep:question  ?ql ."
                + "?Question sep:qid ?qid ."
                + "?Question sep:qshort ?qs ."
                
                //+ "ORDER BY DESC(?z) LIMIT 1 ."          
                + "}";
        Query query = QueryFactory.create(queryString);
        QueryExecution qexec = QueryExecutionFactory.create(query, model);

        try {
            ResultSet results = qexec.execSelect();
            while (results.hasNext()) {
                QuerySolution soln = results.nextSolution();
                // String name = soln.getLiteral("x").getLexicalForm();
                //String des = soln.getLiteral("y").getLexicalForm();
                qid = soln.getLiteral("qid").getLexicalForm();
                uid = soln.getLiteral("u").getLexicalForm();
                String title = soln.getLiteral("t").getLexicalForm();
                String longQues = soln.getLiteral("ql").getLexicalForm();
                String date = soln.getLiteral("y").getLexicalForm();
                String qshort = soln.getLiteral("qs").getLexicalForm();
                //System.out.println(name);
                //System.out.println(des);
                //System.out.println("chek1");
                System.out.print("User ID       : ");
                System.out.println(uid);
                System.out.print("Title         : ");
                System.out.println(title);
                System.out.print("Qshort        : ");
                System.out.println(qshort);
                System.out.print("longQuestion  : ");
                System.out.println(longQues);
                System.out.print("Date          : ");
                System.out.println(date);
                System.out.print("Question id   : ");
                System.out.println(qid);
                //System.out.println("chek2");

            }
        } finally {
            qexec.close();
        }

        FileManager.get().addLocatorClassLoader(rdfPanelQuestionMain.class.getClassLoader());
        Model model2 = FileManager.get().loadModel("/Users/avinda/Desktop/ishara/jena_Enigma/jena_Enigma/src/jena_enigma/enigmardf.rdf");

        String queryUid = "PREFIX sep: <http://www.semanticweb.org/hesh/ontologies/valkyrie/enigmaplus/ontology#>"
                + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
                + "PREFIX strg: <http://www.w3.org/2001/XMLSchema#string#>"
                + "SELECT  * "
                + "WHERE {"
                + "?User sep:uid " + uid + " ." //question title, question short, date, user, rate            
                + "?User sep:email ?x ."
                + "?User sep:reputation ?rep ."
                + "}";
        Query queryU = QueryFactory.create(queryUid);
        QueryExecution qexec2 = QueryExecutionFactory.create(queryU, model2);

        try {
            ResultSet results2 = qexec2.execSelect();
            while (results2.hasNext()) {
                QuerySolution soln2 = results2.nextSolution();

                String email = soln2.getLiteral("x").getLexicalForm();
                String reputation = soln2.getLiteral("rep").getLexicalForm();
                System.out.print("Email         : ");
                System.out.println(email);
                System.out.print("Reputation    : ");
                System.out.println(reputation);
            }
        } finally {
            qexec.close();
        }

    }
}