
/**
 * SCGServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */
package br.org.cipbancos.scg.webservice;

import br.org.cipbancos.scg.webservice.dto.SCGResponse;

/**
 * SCGServiceSkeleton java skeleton for the axisService
 */
public class SCGServiceSkeleton implements SCGServiceSkeletonInterface {

	/**
	 * Auto generated method signature
	 * 
	 * @param confirmation2
	 */

	public br.org.cipbancos.scg.webservice.ScgResponseE retryByConfirmationOperation(
			br.org.cipbancos.scg.webservice.Confirmation confirmation2) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#retryByConfirmationOperation");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param scgRequest4
	 */

	public br.org.cipbancos.scg.webservice.ScgResponseE executeOperation(
			br.org.cipbancos.scg.webservice.ScgRequestE scgRequest4) {

		ScgResponseE scgResponseE = new ScgResponseE();

		SCGResponse param = new SCGResponse();
		param.setConfirmation("Recebido");
		param.setResponse(scgRequest4.getScgRequest().getRequest());
		param.setStatus(0);
		scgResponseE.setScgResponse(param);

		return scgResponseE;

	}

	/**
	 * Auto generated method signature
	 * 
	 * @param id6
	 */

	public br.org.cipbancos.scg.webservice.ScgResponseE retryByIdOperation(br.org.cipbancos.scg.webservice.Id id6) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#retryByIdOperation");
	}

}
