/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface DisbursementApiService {

	DisbursementWithId initiate(DisbursementBase request);
	
	DisbursementWithId retrieve(String crReferenceId);
	
	List<String> retrieveRefIds();
	
	DisbursementWithId update(String crReferenceId, DisbursementBase request);
	
}
