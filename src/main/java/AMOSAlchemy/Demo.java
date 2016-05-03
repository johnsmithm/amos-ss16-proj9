package AMOSAlchemy;

import com.ibm.watson.developer_cloud.service.BadRequestException;

public class Demo {

	public static void main(String[] args) {
		IAlchemyFactory fac = IAlchemyFactory.newInstance();
		IAlchemy service = fac.createAlchemy("1eccdb3cfc18574d5a62e986faf05016f05fbc88");
		try{
			System.out.println("Main industry: " + service.getCompanyMainIndustry("Apple"));
			System.out.println("Main product: " + service.getCompanyMainProduct("Apple"));
			System.out.println("Possible competitors: " + service.getPossibleCompetitors("Apple"));
			System.out.println("News sentiment: " + service.getSentimentAnalisysOfNews("Apple"));
			
		} catch(BadRequestException e){
			System.out.println("Could not find company...");
		}
	}

}
