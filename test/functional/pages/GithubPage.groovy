package pages

import geb.Page

class GithubPage extends Page {

    def titulo = "pauloborba/ResS � GitHub"
    static url = "https://github.com/pauloborba/ResS"

    static at = {
        title ==~ titulo
    }
}
