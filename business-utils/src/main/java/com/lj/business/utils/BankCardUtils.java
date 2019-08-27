package com.lj.business.utils;
/**
 * Copyright &copy; 2017-2020  All rights reserved.
 *
 * Licensed under the 深圳市扬恩科技 License, Version 1.0 (the "License");
 * 
 */

import com.lj.base.core.util.AssertUtils;

/**
 * 
 * 
 * 类说明：银行卡卡号规则判断
 *  
 * 
 * <p>
 * 详细描述：
 *   
 * @Company: 扬恩科技有限公司
 * @author 彭阳
 *   
 * CreateDate: 2017年7月1日
 */
public class BankCardUtils {

	public static void main(String args []){
		 System.out.println("6226899000131490 :"+isCreditCardInChina("6226899000131490"));
		 System.out.println("6221550302410497 :"+isCreditCardInChina("6221550302410497"));
		 System.out.println("5201521271235047 :"+isCreditCardInChina("5201521271235047"));
		 System.out.println("4392250806985650 :"+isCreditCardInChina("4392250806985650"));
		 System.out.println("4512893350756103 :"+isCreditCardInChina("4512893350756103"));
		 System.out.println("6225758310919542 :"+isCreditCardInChina("6225758310919542"));
		 
		 System.out.println("6214836559728064 :"+isCreditCardInChina("6214836559728064"));
		 System.out.println("6212264000007538198 :"+isCreditCardInChina("6212264000007538198"));
		 System.out.println("6225887855931545 :"+isCreditCardInChina("6225887855931545"));
		 System.out.println("6229860000096288 :"+isCreditCardInChina("6229860000096288"));
		 		 
		 
		 
	}
	/***
	 * 信用卡开头的卡号
	 */
	private static String [] creditCardStarts = {
		"370246", "370248", "370249", "427010", "427018", "427019", "427020", "427029",
		"427030", "427039", "370247", "438125", "438126", "451804", "451810", "451811",
		"45806", "458071", "489734", "489735", "489736", "510529", "427062", "524091",
		"427064", "530970", "53098", "530990", "558360", "524047", "525498", "622230",
		"622231", "622232", "622233", "622234", "622235", "622237", "622239", "622240",
		"622245", "622238", "62451804", "62451810", "62451811", "6245806", "62458071",
		"6253098", "628288", "628286", "622206", "526836", "513685", "543098", "458441",
		"622246", "544210", "548943", "370267", "356879", "356880", "356881", "356882",
		"528856", "625330", "625331", "625332", "622236", "524374", "550213", "625865",
		"625866", "374738", "374739", "625708", "625709", "622597", "622599", "625899",
		"360883", "360884", "625929", "625927", "625939", "625987", "625930", "625114",
		"622159", "625021", "625022", "625932", "622889", "625900", "625915", "625916",
		"625115", "622171", "625931", "625918", "625113", "625928", "625914", "625986",
		"625925", "625116", "625921", "625926", "625110", "625942", "622158", "625917",
		"625922", "625934", "625933", "625920", "625924", "403361", "404117", "404118",
		"404119", "404120", "404121", "463758", "519412", "519413", "520082", "520083",
		"552599", "558730", "514027", "622836", "622837", "628268", "625996", "625998",
		"625997", "622838", "625336", "625826", "625827", "544243", "548478", "628269",
		"625908", "625910", "625909", "356833", "356835", "409665", "409666", "409668",
		"409669", "409670", "409671", "409672", "512315", "512316", "512411", "512412",
		"514957", "409667", "438088", "552742", "553131", "514958", "622760", "628388",
		"518377", "622788", "628313", "628312", "622750", "622751", "625145", "622479",
		"622480", "622789", "625140", "5453242", "5491031", "5544033", "553242",
		"356896", "356899", "356895", "436718", "436738", "436745", "436748", "489592",
		"531693", "532450", "532458", "544887", "552801", "557080", "558895", "559051",
		"622166", "622168", "622708", "625964", "625965", "625966", "628266", "628366",
		"625362", "625363", "628316", "628317", "0049104", "0053783", "434910",
		"458123", "458124", "49104", "520169", "522964", "53783", "552853", "622250",
		"622251", "521899", "622253", "622656", "628216", "622252", "6649104", "955590",
		"955591", "955592", "955593", "6653783", "628218", "625028", "625029", "356837",
		"356838", "486497", "545392", "545393", "545431", "545447", "356859", "356857",
		"407405", "421869", "421870", "421871", "512466", "356856", "528948", "552288",
		"622600", "622601", "622602", "517636", "622621", "628258", "556610", "622603",
		"464580", "464581", "523952", "545217", "553161", "356858", "622623", "625911",
		"377152", "377153", "377158", "377155", "625912", "625913", "406365", "406366",
		"428911", "436768", "436769", "487013", "491032", "491034", "491035", "491036",
		"491037", "491038", "518364", "520152", "520382", "548844", "552794", "622555",
		"622556", "622557", "622558", "622559", "622560", "528931", "6858000", "558894",
		"625072", "625071", "628260", "628259", "625805", "625806", "625807", "625808",
		"625809", "625810", "685800", "356885", "356886", "356887", "356888", "356890",
		"439188", "439227", "479228", "479229", "521302", "356889", "545620", "545621",
		"545947", "545948", "552534", "552587", "622575", "622576", "622577", "622578",
		"622579", "545619", "622581", "622582", "545623", "628290", "370285", "370286",
		"370287", "370289", "439225", "518710", "518718", "628362", "439226", "628262",
		"625802", "625803", "461982", "486493", "486494", "486861", "523036", "451289",
		"527414", "528057", "622901", "622902", "622922", "628212", "451290", "524070",
		"625084", "625085", "625086", "625087", "548738", "549633", "552398", "625082",
		"625083", "625960", "625961", "625962", "625963", "356851", "356852", "404738",
		"404739", "456418", "498451", "515672", "356850", "517650", "525998", "622177",
		"622277", "628222", "622500", "628221", "622176", "622276", "622228", "625957",
		"625958", "625993", "625831", "625076", "625077", "625074", "625075", "356827",
		"356828", "356830", "402673", "402674", "486466", "519498", "520131", "524031",
		"548838", "622148", "622149", "622268", "356829", "622300", "628230", "622269",
		"625099", "625953", "625350", "625351", "625352", "519961", "625839", "622178",
		"622179", "628358", "512431", "520194", "622282", "622318", "622466", "628285",
		"628309", "622383", "622385", "628299", "628242", "622595", "622303", "622596",
		"628204", "622450", "622476", "628278", "628291", "622397", "622426", "625995",
		"628205", "628214", "625529", "622428", "622321", "628273", "625901", "622898",
		"622900", "628281", "628282", "622806", "628283", "628319", "622315", "625950",
		"628295", "62536602", "628279", "622888", "628398", "622868", "622899",
		"628255", "625988", "622566", "622567", "622625", "622626", "625946", "628200",
		"531659", "622157", "435744", "435745", "483536", "622525", "622526", "998801",
		"998802", "528020", "622155", "622156", "526855", "356869", "356868", "625360",
		"625361", "628296", "625825", "625823", "628210", "622283", "625902", "622740",
		"628250", "628253", "628355", "628303", "622462", "628272", "628381", "622481",
		"625288", "625888", "625186", "628336", "625526", "622289", "622389", "628300",
		"622648", "628248", "622288", "628280", "622686", "628289", "628297", "628332",
		"622218", "628267", "622372", "622471", "622472", "622371", "625091", "622293",
		"622295", "622296", "622373", "622451", "622294", "625940", "622798", "625010",
		"622381", "622675", "622676", "622677", "622386", "625107", "622387", "622423",
		"625062", "625063", "622360", "622361", "625034", "625096", "625098", "625026",
		"625024", "622376", "622378", "622377", "625092", "622453", "622456", "624303",
		"625008", "625009", "625055", "625040", "625042", "625141", "625143", "625136",
		"625046", "625044", "625058", "625048", "625053", "625060", "622493", "625198",
		"625196", "625147", "622482", "622483", "622484", "625842", "6258433",
		"6258434", "622433", "622775", "622785", "622920", "601100", "601101",
		"60112010", "60112011", "60112012", "60112089", "601121", "601123", "601124",
		"601125", "601126", "601127", "601128", "6011290", "6011291", "6011292",
		"6011293", "60112013", "6011295", "601122", "6011297", "60112980", "60112981",
		"60112986", "60112987", "60112988", "60112989", "60112990", "60112991",
		"60112992", "60112993", "6011294", "6011296", "60112996", "60112997", "6011300",
		"60113080", "60113081", "60113089", "601131", "601136", "601137", "601138",
		"6011390", "60112995", "6011392", "6011393", "60113940", "60113941", "60113943",
		"60113944", "60113945", "60113946", "60113984", "60113985", "60113986",
		"60113988", "60112994", "6011391", "601140", "601142", "601143", "601144",
		"601145", "601146", "601147", "601148", "601149", "601174", "60113989",
		"601178", "6011399", "601186", "601187", "601188", "601189", "644", "65",
		"6506", "6507", "6508", "601177", "601179", "6509", "60110", "60112", "60113",
		"60114", "60119", "625014", "625016", "622354", "625017", "625018", "625019",
		"625124", "625154", "622444", "625003", "625011", "625012", "625020", "625023",
		"625025", "625027", "625031", "625039", "625078", "625079", "625103", "625106",
		"625006", "625112", "625120", "625123", "625125", "625127", "625131", "625032",
		"625139", "625178", "625179", "625220", "625320", "625111", "625132", "625244",
		"625243", "622356", "622145", "625013", "622130", "625002", "625033", "625035",
		"625007", "625004", "6250386", "6250388", "625904", "625104", "625804",
		"625814", "625817", "625840", "625841", "624306", "622346", "622347", "622349",
		"622350", "622352", "622353", "622812", "622810", "622811", "628310", "625919",
		"376968", "376969", "400360", "403391", "403392", "376966", "404158", "404159",
		"404171", "404172", "404173", "404174", "404157", "433667", "433668", "433669",
		"514906", "403393", "520108", "433666", "558916", "622678", "622679", "622680",
		"622688", "622689", "628206", "556617", "628209", "518212", "628208", "356390",
		"356391", "356392", "622916", "622918", "622919", "628370", "628371", "628372",
		"622657", "622685", "622659", "622687", "625978", "625980", "625981", "625979",
		"356839", "356840", "406252", "406254", "425862", "481699", "524090", "543159",
		"622161", "622570", "622650", "622655", "622658", "625975", "625977", "628201",
		"628202", "625976", "625339", "622801", "523959", "528709", "539867", "539868",
		"622637", "622638", "628318", "528708", "622636", "625967", "625968", "625969",
		"625971", "625970", "377187", "622265", "622266", "625972", "625973", "625093",
		"625095", "522001", "622163", "622853", "628203", "622851", "622852", "625903",
		"622778", "628207", "628379", "628367", "625050", "625836", "628333", "622921",
		"628321", "625598", "622286", "628236", "628228", "622813", "622818", "628359",
		"628270", "628311", "628261", "628251", "622651", "625828", "625652", "625700",
		"622613", "628220", "622809", "628224", "625952", "625119", "628213", "628263",
		"628305", "628239", "628238", "628257", "622817", "628287", "625959",
		"62536601", "628391", "628233", "628231", "628275", "622565", "622287",
		"628252", "628306", "628227", "628234", "628237", "628219", "622270", "628368",
		"625090", "628293", "622611", "622722", "628211", "625989", "625080", "628235",
		"628322", "625088", "622469", "628307", "628229", "628397", "622802", "622290",
		"628232", "628301", "622829", "625819", "622808", "628308", "622815", "622816",
		"628226", "628223", "628217", "628382", "625158", "622569", "628369", "622906",
		"628386", "625519", "625506", "628392", "628271", "628328", "625829", "625943",
		"622790", "625502", "628331"};
 
	/***
	 * 是否大陆信用卡
	 * @param cardNo
	 * @return
	 */
	public static boolean isCreditCardInChina(String cardNo){ 
		AssertUtils.notNullAndEmpty(cardNo);
		for(String prefix : creditCardStarts){
			if(cardNo.startsWith(prefix))
				return true;//信用卡开头
		}
		return false;//没有这些开头，为借记卡或则非法卡
			//算法有误
//		
//		boolean isOddPos = true;//判断是否奇数位
//		int cardCheckNo = 0;//计算信用卡校验
//		char []cardNoArray = cardNo.toCharArray();
//		for(char cardPosNo : cardNoArray){
//			if(!Character.isDigit(cardPosNo))
//				return false;//包含非数字，不是信用卡
//			if(isOddPos){//奇数位
//				int oddPosValue = Integer.valueOf(  String.valueOf(cardPosNo)  )*2;
//				//奇数位算法是将数位值*2，得到的各位数字相加
//				cardCheckNo += (oddPosValue/10+oddPosValue%10);
//			}else{
//				cardCheckNo += Integer.valueOf(  String.valueOf(cardPosNo)  );
//			}
//			isOddPos = !isOddPos;//下一位是否奇数位，求反
//		}
//		return  cardCheckNo % 10 ==0;
	}
}
