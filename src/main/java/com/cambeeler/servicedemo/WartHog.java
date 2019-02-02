package com.cambeeler.servicedemo;

public
class WartHog
{
    private final long nbr;
    private final String stuff;

    public WartHog(long nbr, String stuff)
    {
        this.nbr = nbr;
        this.stuff = stuff;
    }

    public long getNbr()
    {
        return nbr;
    }

    public String getStuff()
    {
        return stuff;
    }
}
