package Government.services;

import Government.entities.Document;

public  abstract class GovermmentMember {

    protected GovermmentMember nextGovermmentMember;


    public abstract void readDocument(Document document);

    public GovermmentMember setNextGovermmentMember(GovermmentMember member){
        this.nextGovermmentMember = member;
        return this;
    }

    public GovermmentMember getGovermmentMember() {
        return nextGovermmentMember;
    }
}
