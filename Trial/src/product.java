
public class product {
	private String idproduct;
	private final String type;
	private final String manfact;
	private String prodate;
        private String expdate;
	
	public product(String type,String manfact){
		this.type = type;
		this.manfact = manfact;
		
	}
	
	public void setidproduct(String idproduct){
		this.idproduct = idproduct;
	}
	public void setprodate(String prodate){
		this.prodate = prodate;
	}
	public void setexpdate(String expdate){
		this.expdate = expdate;
	}
	public String getidproduct(){
		return(this.idproduct);
	}
	public String gettype(){
		return(this.type);
	}
	public String getmanfact(){
		return(this.manfact);
	}
	public String getprodate(){
		return(this.prodate);
	}
	public String getexpdate(){
		return(this.expdate);
	}
}
