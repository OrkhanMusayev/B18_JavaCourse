package WarmpUpTasks;

public class warmup_task_part2 {
    public static void main(String[] args) {
        int StatusCode = 410;
        String result = " ";
        if(StatusCode == 200){
            result = "OK";
        }if(StatusCode == 201){
            result = "Created";
        }if(StatusCode == 202){
            result = "Accepted";
        }if(StatusCode ==301){
            result = "Moved Permanently";
        }if(StatusCode ==303){
            result = "See other";
        }if(StatusCode == 304){
            result = "Not Modified";
        }if(StatusCode  ==  307){
            result  =" Temporary Redirect";
        }if (StatusCode == 400){
            result =  "Bad Request";
        }if(StatusCode ==  401){
            result = "Unauthorized";
        } if(StatusCode == 403){
            result  = "Forbiden";
        } if(StatusCode  ==  404){
            result  =" Not Found";
        }if (StatusCode == 410){
            result =  "Gone";
        } if(StatusCode ==500){
            result = "Internal Server Error";
        } if(StatusCode==503){
            result ="Server Unable";
        }
        System.out.println(result);













    }
}
