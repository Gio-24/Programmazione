package arraypila;

public class PaginaWeb {
    private String url;
    private String titolo;

    public PaginaWeb(String url, String titolo) {
        this.url = url;
        this.titolo = titolo;
    }

    public String getUrl() {
        return url;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public String toString() {
        return titolo + " (" + url + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        PaginaWeb other = (PaginaWeb) obj;
        return url.equals(other.url) && titolo.equals(other.titolo);
    }
}
