void main(){

    Query q1 = new Query("Szukana fraza");
    WebsiteWWW w1 = new WebsiteWWW("http://portal.com");

//komentarz
    SearchResult sr1 = new SearchResult();
    if (w1.checkConnection() == true) {
        sr1 = q1.searchIn(w1);
        sr1.saveResultsToFile( "Nowyplik.txt");
    }
    else {
        File f1 = new File("NowyError.txt");
        f1.writeText(w1.connectionStatus);
        f1.close();
    }
}