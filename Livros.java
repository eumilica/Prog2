package biblioteca;

public class Livros{
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    public Livros(String titulo, String autor, int anoPublicacao) {
    	this.titulo = titulo;
    	this.autor = autor;
    	this.anoPublicacao = anoPublicacao;
    	
    }
    public String getTitulo() {
    	return titulo;
    }
    public void setTitulo(String titulo) {
    	this.titulo = titulo;
    }
    public String getAutor() {
    	return autor;
    }
    public void setAutor(String autor) {
    	this.autor = autor;
    }
    public int getAnoPublicacao() {
    	return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
    	this.anoPublicacao = anoPublicacao;
    }
    public String toString() {
    	return "Título: "+ titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao;
    }}