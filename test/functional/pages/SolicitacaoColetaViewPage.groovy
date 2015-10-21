package pages

/**
 * Created by danie_000 on 6/25/2015.
 */
import geb.Page

class SolicitacaoColetaViewPage extends Page {
    def titulo = "Solicitacao de coleta"
    static url = "ResS/solicitacaoColetas/index/3"

    static at = {
        title ==~ titulo
    }
	def boolean hasOk(){
		if($(".ok") == null){
			return false
		}else{
			return true
		}
	}
	
    }