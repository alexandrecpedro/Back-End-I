package Government.services;

import Government.entities.Document;

public class Minister  extends GovermmentMember{

    @Override
    public void readDocument(Document document) {
        if (document.getType() <= 2) System.out.println(document.getContent() + ", reader Minister");

        if (this.nextGovermmentMember != null) this.nextGovermmentMember.readDocument(document);
    }
}
