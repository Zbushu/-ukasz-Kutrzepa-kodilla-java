package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User jessica = new Millenials("Jessica123");
        User john = new ZGeneration("John123");
        User monica = new YGeneration("Monica123");

        //When
        String jessicaPublish = jessica.sharePost();
        System.out.println("Jessica share on: " + jessicaPublish);
        String johnPublish = john.sharePost();
        System.out.println("John share on: " + johnPublish);
        String monicaPublish = monica.sharePost();
        System.out.println("Monica share on: " + monicaPublish);

        //Then
        Assert.assertEquals("Snapchat", jessicaPublish);
        Assert.assertEquals("Facebook", johnPublish);
        Assert.assertEquals("Twitter", monicaPublish);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User jessica = new Millenials("Jessica123");

        //When
        String jessicaPublish = jessica.sharePost();
        System.out.println("Jessica share on: " + jessicaPublish);
        jessica.setSocialPublisher(new FacebookPublisher());
        jessicaPublish = jessica.sharePost();
        System.out.println("Jessica loved: " + jessicaPublish);

        //Then
        Assert.assertEquals("Facebook", jessicaPublish);
    }
}
