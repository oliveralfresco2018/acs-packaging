package org.alfresco.rest.search;

import org.alfresco.rest.SearchTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchEnvironmentTest extends SearchTest
{
    @Test
    public void testSearchWorksUsingBothACSs() throws Exception
    {
        SearchResponse response = restClientServer1.authenticateUser(dataContent.getAdminUser()).withSearchAPI().search(createQuery("alfresco"));
        Assert.assertEquals(72, response.getEntries().size());

        response = restClientServer1.authenticateUser(dataContent.getAdminUser()).withSearchAPI().search(createQuery("alfresco"));
        Assert.assertEquals(72, response.getEntries().size());
    }
}
