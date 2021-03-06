# RetrofitRecyclerView
How you can Insert and Fetch the data from server using Retrofit and RecyclerView?

**Introduction to Retrofit** Retrofit is a REST client for Android, through which you can make easy to use interfaces which can turn any Android app into a powerful one. Retrofit can perform Async and sync requests with automatic JSON parsing without any effort

1.	Automatic JSON parsing
2.	No Caching mechanism
3.	no retry policy
4.	no Image loading

**Retrofit can parse many other types of responses automatically like:**

**Boolean –** Web API response needs to be a boolean.

**Integer –** Web API response needs to be an integer. Date– Web API response should be Long format date.

**String –** Web API response needs to be in String format.

**Object –** Web API response needs to be in Json object.

**Collections –** Web API response needs to be in a String Format. Image Loading

**Must add these dependencies in build.gradle(Module app)**

    compile 'com.squareup.retrofit:retrofit:1.9.0'
    
    compile 'com.squareup.retrofit2:converter-gson:2.2.0'
    
    compile 'com.google.code.gson:gson:2.6.2'
    
    implementation 'com.android.support:cardview-v7:26.1.0'
    
    implementation 'com.android.support:recyclerview-v7:26.1.0'
    
    implementation 'com.android.support:design:26.1.0'
