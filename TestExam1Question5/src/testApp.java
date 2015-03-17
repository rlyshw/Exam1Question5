import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class testApp {
	String[] validNumbers = {
			"4532676388963619",
			"4485938898867947",
			"4916104063184217",
			"6011130410838832",
			"6011104462984356",
			"6011092096353785",
			"6709046584101772",
			"6706389401638128",
			"5237754427249764",
			"5381591120012980",
			"5273260665767058",
			"3112701319723682",
			"3112021005119180",
			"3088059793663647",
			"5038306247492651",
			"6304779495782533"};
	String unformattedRandoms = "9881384197966911,1441371668973153,8923735516336337,1398673434469378,9296194967173893,6885666791593883,3267946573237156,2357643529634955,6535718972776116,5577879676382641,9599988137836473,8818234472381726,7213455511181185,2734541466235463,7586767516622938,2176998558714595,2894294741689458,7489343594524179,1361757719466768,7311872681719755,5582875262376936,8167559146567119,9256775235118821,7439814811222197,2368375912693145";
	String[] invalidNumbers = unformattedRandoms.split(",");
	
	public ArrayList<String> listify(String str){
		//turns a string into a list
		ArrayList<String> strList = new ArrayList<String>();
		String[] ccAr = str.split("");
		for (String digit : ccAr) {
			strList.add(digit);
		}
		return strList;
	}
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		validNumbers = null;
		invalidNumbers = null;
		unformattedRandoms = null;
	}

	@Test
	public void testLuhnTest() {
		for(String str : validNumbers){
			assertTrue("Failed truthy test: "+str, app.luhnTest(listify(str)));
		}
		for(String str : invalidNumbers){
			assertFalse("Failed falsy test"+str, app.luhnTest(listify(str)));
		}
	}

}
