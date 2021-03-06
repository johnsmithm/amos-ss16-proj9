/*!
*
* AMOS-SS16-PROJ9
*
* Released under the AGPL license
* Date: 2016-05-25
*/
package AMOSAlchemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibm.watson.developer_cloud.alchemy.v1.model.Documents;
import com.ibm.watson.developer_cloud.alchemy.v1.model.DocumentsResult;
import com.ibm.watson.developer_cloud.alchemy.v1.model.Entities;
import com.ibm.watson.developer_cloud.service.BadRequestException;

public interface IAlchemyNews {
	public  Map<String,String> getRecentDevelopmentList(String companyName) throws BadRequestException;
	public  List<String> getPossibibleCompetitorsList(String companyName) throws BadRequestException;
	public  List<String> getPossibibleSubTypesList(String companyName) throws BadRequestException;
	public  Documents getSentimentAnalysisOfNews(String companyName, String entityName, String startTime, String endTime, int count) throws BadRequestException;
	
}
