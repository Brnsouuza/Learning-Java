class book {
    String titulo;
    String autor;

    book(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
}

class My_Books {
    public static void main(String[] args){
        book[] books = {
            new book("1984", "George Orwell"),
            new book("Dom Casmurro", "Machado de Assis"),
            new book("Cem Anos de Solidão", "Gabriel García Márquez"),
            new book("O Pequeno Príncipe", "Antoine de Saint-Exupéry"),
            new book("A Metamorfose", "Franz Kafka"),
            new book("O Senhor dos Anéis", "J.R.R. Tolkien"),
            new book("Orgulho e Preconceito", "Jane Austen"),
            new book("A Revolução dos Bichos", "George Orwell"),
            new book("Moby Dick", "Herman Melville"),
            new book("O Alquimista", "Paulo Coelho")
        };
        for (book book : books) {
            System.out.println("Título: " + book.titulo + " | Autor: " + book.autor);
                }
    }
}