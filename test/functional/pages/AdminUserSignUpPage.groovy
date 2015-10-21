package pages
import geb.Page

class AdminUserSignUpPage {
    def titulo = "Admin User Sign Up"
    static url = "/ResS/adminUser/signUp"

    static at = {
        title ==~ titulo
    }

    def fillUserInfo(String name, String cpf, String login, String password, String email, String phone){
        $("form").adminName = name
        $("form").adminCpf = cpf
        $("form").adminLogin = login
        $("form").adminPassword = password
        $("form").adminEmail = email
        $("form").adminPhone = phone
    }

    def submitUserInfo(){
        $("input", name: "submit").click()
    }

    def hasMessage(){
        def message = $('.message')
        if(message){
            return true
        } else {
            return false
        }
    }
}
