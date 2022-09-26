package Org.Testing.Payloads;

public class PojoSimpleBody {
	
	public static PojoBodyData GetBodyData() {
		PojoBodyData data = new PojoBodyData();
		data.setFirstname("Sushil");
		data.setLastname("Vishwakarnma");
		data.setProfession("QA/QC");
		data.setAge("29");
		data.setId("777");
		return data;
		
		
		
	}

}
