package iterator

class BookShelf(
    private val books: MutableList<Book>,
    private var last: Int = 0
): Aggregate {
    override fun iterator(): Iterator {
        return BookShelfIterator(this)
    }

    fun getBookAt(index: Int): Book {
        return this.books[index]
    }

    fun appendBook(book: Book) {
        this.books[last] = book
        last++
    }

    fun getLength(): Int {
        return last
    }

}