package com.example.demo1.pojo;

public class Relation {

    private int hostId;
    private int aimId;

    public Relation(int hostId, int i) {
        this.aimId = i;
        this.hostId = hostId;

    }

    @Override
    public String toString() {
        return "Relation{" +
                "hostId=" + hostId +
                ", aimId=" + aimId +
                '}';
    }

    public int getHostId() {
        return hostId;
    }

    public int getAimId() {
        return aimId;
    }

    public void setHostId(int hostId) {
        this.hostId = hostId;
    }

    public void setAimId(int aimId) {
        this.aimId = aimId;
    }
}

