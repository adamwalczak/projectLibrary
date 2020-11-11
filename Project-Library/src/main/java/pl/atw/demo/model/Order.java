package pl.atw.demo.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the orders database table.
 * 
 */
@Entity
@Table(name="orders")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ORDERS_ORDERID_GENERATOR", sequenceName="SEQ_ORDERS", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ORDERS_ORDERID_GENERATOR")
	@Column(name="order_id")
	private Integer orderId;

	private String name;

	@Column(name="order_date")
	private Timestamp orderDate;

	private String status;

	private String title;

	//bi-directional many-to-one association to Book
	@ManyToOne
	@JoinColumn(name="book_id")
	private Book book;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public Order() {
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}