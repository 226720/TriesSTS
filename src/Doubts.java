import java.util.ArrayList;
import java.util.List;

public class Doubts {
public static void main(String[] args) {
	Integer a=10;
	System.out.println(a+10);
	String place ="IV-tvm";
	String[] region= null;
	region=place.split("-");
	//region[0]
			System.out.println(region[0]);
			
	String regionCheck = null;
	List<String> regionChecks = new ArrayList<>();
	regionChecks.add("Region1");
	regionChecks.add("region2");
	regionChecks.add("region3 ");
	regionChecks.add("region4");
	long count= regionChecks.stream().filter(e->e.contains("region")).count();
	if(count>1) {
		System.out.println("first stream");
	}
	if(count>2) {
		System.out.println("second stream");
	}
	if(regionChecks.contains(regionCheck)) {
		System.out.println("no error");
	}
	else {
	System.out.println("error");	
	}
	if(regionChecks.contains("region3")) {
		System.out.println("region doubt error");
	}
}
}
