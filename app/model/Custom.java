package model;

@SuppressWarnings("unused")
public class Custom extends BaseEntity{

	private static final long serialVersionUID = 1L;

	private Integer cid;
	
	private String cname;
	

	private Integer sort;

	public Integer getCid() {
		return this.getInteger("cid");
	}

	public void setCid(Integer cid) {
		this.set("cid", cid) ;
	}

	public String getCname() {
		return this.getString("cname");
	}

	public void setCname(String cname) {
		this.set("cname", cname);
	}

	public Integer getSort() {
		return this.getInteger("sort");
	}

	public void setSort(Integer sort) {
		this.set("sort", sort);
	}
	
	
	
	

}
