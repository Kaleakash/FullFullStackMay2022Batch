

export class MyService {

    checkUserDetails(login:any): string{
        if(login.email=="raj@gamil.com" && login.password=="123"){
            return "success"
        }else {
            return "failure";
        }
    }
}