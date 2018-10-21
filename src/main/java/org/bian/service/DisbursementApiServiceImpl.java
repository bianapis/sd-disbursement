/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class DisbursementApiServiceImpl implements DisbursementApiService {

	public DisbursementWithId initiate(DisbursementBase request){
		return JsonReader.read("initiate-DisbursementWithId.json",new TypeReference<DisbursementWithId>(){});
	}
	
	public DisbursementWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-DisbursementWithId.json",new TypeReference<DisbursementWithId>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public DisbursementWithId update(String crReferenceId, DisbursementBase request){
		return JsonReader.read("update-DisbursementWithId.json",new TypeReference<DisbursementWithId>(){});
	}
	
}
