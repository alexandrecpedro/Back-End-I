package Government.services;

import Government.entities.Document;

public class President extends GovermmentMember {

    @Override
    public void readDocument(Document document) {
        if (document.getType() <= 3) System.out.println(document.getContent() + ", reader President");

        if (this.nextGovermmentMember != null) this.nextGovermmentMember.readDocument(document);
    }
}
