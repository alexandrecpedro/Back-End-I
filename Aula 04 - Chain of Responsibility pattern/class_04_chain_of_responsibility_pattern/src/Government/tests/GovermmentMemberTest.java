package Government.tests;

import Government.entities.Document;
import Government.services.Congressperson;
import Government.services.GovermmentMember;
import Government.services.Minister;
import Government.services.President;
import org.junit.jupiter.api.Test;

class GovermmentMemberTest {

    @Test
    public void shouldReturnMembersPermissionWhenTypeOne(){

        GovermmentMember member = new Congressperson().setNextGovermmentMember(new Minister().setNextGovermmentMember(new President()));
        Document document = new Document("All read", 1);

        member.readDocument(document);
    }


    @Test
    public void shouldReturnMembersPermissionWhenTypeTwo(){

        GovermmentMember member = new Congressperson().setNextGovermmentMember(new Minister().setNextGovermmentMember(new President()));
        Document document = new Document("All read", 2);

        member.readDocument(document);
    }


    @Test
    public void shouldReturnMembersPermissionWhenTypeThree(){

        GovermmentMember member = new Congressperson().setNextGovermmentMember(new Minister().setNextGovermmentMember(new President()));
        Document document = new Document("All read", 3);

        member.readDocument(document);
    }
}