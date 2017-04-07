package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) throws IOException {
        // Replace your student to the next, however, DO NOT put your own student number on GitHub
        String studentNr = "014773271";
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats2017.herokuapp.com/students/"+studentNr+"/submissions";
        String bodyText = Request.Get(url).execute().returnContent().asString();

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);
        
        System.out.println("Course: Ohjelmistotuotanto, spring 2017");
        System.out.println("student number: " + studentNr);
        int tasks = 0, hours = 0;
        for (Submission submission : subs) {
            System.out.println(submission);
            tasks += submission.getTotalCompleted();
            hours += submission.getHours();
        }
        System.out.println("total: " + tasks + " tasks, " + hours + " hours");

    }
}