import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.google.common.collect.Lists;
public class ForStream {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		List<Long> numberList = new ArrayList<>();
		numberList.add(1000l);
		numberList.add(990l);
		System.out.println("Trial");
		for(Long nums:numberList) {			
			String newNum = "HI"+nums;
			System.out.println(newNum);
			if(newNum!=null) {
				stringList.add(newNum);
			}
			
		}
		
		for(Long nums: numberList) {
			for(String name:stringList) {
				
			}
		}
	//	List<List<Long>> list = Lists.partition(new ArrayList<Long>(Ids),1);
		
		List<Long> listtry;
//		List<Response> respList;
//		Map<Long, Response> map = new HashMap<>();
//		
//		for(Long longtry: listtry) {
//			
//			for(Response r:respList) {
//				
//				if(longtry.equals(respList.getPayLoad().getIdentifier().getPlanId())) {
//					map.put(longtry,response);
//				}
//				
//			}
//			if(!map.containsKey(tripId)) {
//				map.put(tripId,null);
//			}
//		}
		
		Map<String,String> map = new HashMap<>();
		
		
	}
}
