/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.module.paypal;

import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.construct.Flow;
import org.mule.module.paypal.test.verify.PaypalTestPayload;
import org.mule.tck.FunctionalTestCase;

public class PaypalTestDriver extends FunctionalTestCase 
{

    @Override
    /** @see FunctionalTestCase#getConfigResources() */
    protected String getConfigResources() 
    {
        return "mule-config.xml";
    }

    private Flow lookupFlowConstruct(String name)
    {
        return (Flow) muleContext.getRegistry().lookupFlowConstruct(name);
    }
   
    @Test
    public void testPayment() throws Exception
    {
        final Flow flow = lookupFlowConstruct("paymentDemo");
        final PaypalTestPayload payload = new PaypalTestPayload("200", "123");
        final MuleEvent event = getTestEvent(payload);
        flow.process(event);
    }
    
    
}
