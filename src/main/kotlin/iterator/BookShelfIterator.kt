package iterator

class BookShelfIterator(
    private val bookShelf: BookShelf,
    private var index: Int = 0
): Iterator {
    override fun hasNext(): Boolean {
        return index < bookShelf.getLength()
    }

    override fun next(): Any {
        val book = bookShelf.getBookAt(index)
        index++
        return book
    }
}