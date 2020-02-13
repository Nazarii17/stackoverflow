package com.tkachuk.stackoverflow.web;



import com.google.common.collect.ImmutableList;
import com.tkachuk.stackoverflow.model.StackoverflowWebsite;
import com.tkachuk.stackoverflow.service.StackoverflowService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StackoverflowControllerTest {
    @Mock
    private StackoverflowService stackoverflowService;
    @InjectMocks
    StackoverflowController soct;
//    @Before
//    public void setUp() throws Exception {
//        soct = new StackoverflowController();
//    }
    @Test
    public void getListOfProviders() throws Exception{
        //prepare
        when(stackoverflowService.findAll()).thenReturn(ImmutableList.of());
        //testing
        List<StackoverflowWebsite> stackoverflowWebsiteList = soct.getListOfProviders();
        //validate
        verify(stackoverflowService).findAll();
    }
}