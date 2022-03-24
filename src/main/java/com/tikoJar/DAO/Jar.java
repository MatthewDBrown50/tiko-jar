package com.tikoJar.DAO;

import java.util.ArrayList;
import java.util.List;

public class Jar extends MessageJar {

    private Long serverID;
    private String serverName;
    private OpeningCondition openingCondition;

    public Jar(){}

    public Jar(Long serverID, String serverName, OpeningCondition openingCondition, List<Message> message) {
        this.serverName = serverName;
        this.serverID = serverID;
        this.openingCondition = openingCondition;
        super.setMessage(message);
    }

    public String getServerName() {return serverName;}

    public void setServerName(String serverName) {this.serverName = serverName;}

    public Long getServerID() {
        return serverID;
    }

    public void setServerID(Long serverID) {
        this.serverID = serverID;
    }

    public OpeningCondition getOpeningCondition() {
        return openingCondition;
    }

    public void setOpeningCondition(OpeningCondition openingCondition) {
        this.openingCondition = openingCondition;
    }
}
