package pages

import geb.Page

class LoginPage extends Page{

    def titulo = "Logar"
    static url = "ResS/login"

    static at = {
        title ==~ titulo
    }

    def fillCredentials(LinkedHashMap gerador){
        $("form").cnpj = gerador.cnpj
        $("form").password = gerador.password
    }

    def fillCred(String cred){
        if(select(cred)){
            $("form").cnpj = cnpj
        }
    }

    def fillPass(String pass){
        if(select(pass)){
            $("form").pass = pass
        }
    }

    def select(String s){
        if($('div', id: 'status').find('input', text: s)){
           return true
        }
    }

}
