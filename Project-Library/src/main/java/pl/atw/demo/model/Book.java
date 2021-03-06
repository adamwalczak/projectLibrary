package pl.atw.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the books database table.
 * 
 */
@Entity
@Table(name="books")
@NamedQuery(name="Book.findAll", query="SELECT b FROM Book b")
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="BOOKS_BOOKID_GENERATOR", sequenceName="SEQ_BOOKS", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BOOKS_BOOKID_GENERATOR")
	@Column(name="book_id")
	private Integer bookId;

	private Boolean available;

	private String category;

	private String description;

	private String title;

	//bi-directional many-to-one association to Author
	@ManyToOne
	@JoinColumn(name="author")
	private Author authorBean;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="book")
	private List<Order> orders;

	public Book() {
	}

	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Boolean getAvailable() {
		return this.available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthorBean() {
		return this.authorBean;
	}

	public void setAuthorBean(Author authorBean) {
		this.authorBean = authorBean;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setBook(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setBook(null);

		return order;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", available=" + available + ", category=" + category + ", description="
				+ description + ", title=" + title + ", authorBean=" + authorBean + ", orders=" + orders + "]";
	}
	
}