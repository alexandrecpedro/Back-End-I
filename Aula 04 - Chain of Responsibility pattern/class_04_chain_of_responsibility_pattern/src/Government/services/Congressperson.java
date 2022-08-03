package Government.services;

import Government.entities.Document;

public class Congressperson extends GovermmentMember{

    @Override
    public void readDocument(Document document) {
        if (document.getType() == 1) System.out.println(document.getContent() + " reader GovermmentMember");

        if (this.nextGovermmentMember != null) this.nextGovermmentMember.readDocument(document);
    }

}
