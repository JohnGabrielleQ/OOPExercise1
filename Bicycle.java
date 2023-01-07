class Bicycle
{
	private String ownerName;
	private String TagNo;

	public Bicycle(){
		owner = "Unknown";
		TagNo = "Unknown";
	}

	public Bicycle(String Name,String tagno){
		ownerName = Name;
		TagNO = tagno;
	}
	
	public String getownername(){
		return ownerName;
	}
	public String getTagNo(){
		return TagNo;
	}
	public void setownername(String name){
		ownerName = name;
	}
		public void setTagNo(String name){
			TagNo = name;
		}

	}