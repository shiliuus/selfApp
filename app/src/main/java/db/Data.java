package db;


import com.systemsinmotion.selfApp.R;

/**
 * Created by lshi on 10/24/2014.
 */
public class Data {

    public static void loadData(DatabaseHelper dbHelper) {
        //case0
        Case case0 = new Case();
        case0.setId(0);
        case0.setTitle("Home Connections");
        case0.setDesc("*Best Buy wants to give store employees a way to help customers sign up for TV, Internet, and Phone services at home.");
        case0.setAppType(1);
        case0.setClient("BestBuy");
        case0.setKeyHeight("*Helped initiate and streamline sales for TV, Internet and Phone services. \n" +
                "*Provides a quick and easy for customers to get connected right from the store. \n" +
                "*Easy-to-use interface allows for quick fulfillment for the customer. \n" +
                "*Configurable solution provides flexibility for future change requests and vendor-specific add-ons that can optionally be sold to the customer.");
        case0.setSolution("*Created a REST Level 3 framework to support various scenarios. \n" +
                "*Back-end: Full LAMP stack with service integrations. \n" +
                "*Front-end: Fully compliant, cross-browser HTML 5, CSS 2.1/3, and JavaScript enhanced with AngularJS.");
        case0.setResult("unknown");
        case0.setStartTime("test startTime");
        case0.setEndTime("test endTime");
        case0.setendPoint("test endPoint");

        //case1
        Case case1 = new Case();
        case1.setId(1);
        case1.setTitle("FMS Mobile App");
        case1.setDesc("*Geek Squad wants a mobile phone solution for agents to use to view their route and manage the order process while in a client’s home.");
        case1.setAppType(1);
        case1.setClient("BestBuy");
        case1.setKeyHeight("*Highly functional application with user-friendly interface\n" +
                "*Greatly increases order processing allowing Geek Squad agents to be more effective in the field and saves time\n" +
                "*Able to pull up entire history of client orders\n" +
                "*Able to capture payment from the client and signature for the work\n" +
                "*Quick calling features to client and Geek Squad Dispatch Center");
        case1.setSolution("*Purely native, android solution supporting the latest Android versions\n" +
                "*Reusable layouts and components for optimal app performance\n" +
                "*Complete object-oriented design, localized data, and configuration options\n" +
                "*Dynamic interface which updates automatically as necessary based on data from services\n" +
                "*Several integrations with Java Spring web services for asynchronous data \n" +
                "*Integration with Google Play services for drawing data points on a Google map. Also integration with Google Maps for navigation.\n");
        case1.setResult("unknown");
        case1.setStartTime("test startTime");
        case1.setEndTime("test endTime");
        case1.setendPoint("test endPoint");



        //case2
        Case case2 = new Case();
        case2.setId(2);
        case2.setTitle("Geek Squad App");
        case2.setDesc("*Geek Squad wants to provide a cross-platform solution to provide clients with tools to troubleshoot their mobile phone as well as provide extra security features and data transfer options.");
        case2.setAppType(1);
        case2.setClient("BestBuy");
        case2.setKeyHeight("*Customer is able to lock, locate, and recover their device if lost or stolen\n" +
                "*Customer is able to easily transfer their data from one device to another over a wi-fi connection\n" +
                "*Enables Geek Squad agents with effective tools for helping customers in various mobile troubleshooting scenarios\n" +
                "*Downloaded over 50,000 times from the app store\n" +
                "*Used by over 24,000 Geek Squad agents");
        case2.setSolution("*Native Android, iOS, and Windows mobile solutions\n" +
                "*Full integrations with back-end services supporting device security features\n" +
                "*Speedy data transfer using a wi-fi connection of all customer data from one device to another\n" +
                "*Device-specific features for testing various hardware functionalities");
        case2.setResult("unknown");
        case2.setStartTime("test startTime");
        case2.setEndTime("test endTime");
        case2.setendPoint("test endPoint");



        //case3
        Case case3 = new Case();
        case3.setId(3);
        case3.setTitle("Comp Shop");
        case3.setDesc("*Show rooming? Let’s arm the Blue Shirts with information to drive sales and prevent this phenomena.\n" +
                "*Price Matching? Let’s show the Blue Shirt all of the competitor prices and let them drive the sales with that knowledge!" +
                "*Comp Shop is a tool that can be used by Blue Shirts as they discuss products with customers. \n" +
                "*Comp Shop pulls information from the competitors (Amazon.com, Target.com, Walmart.com, RadioShack.com) and compares them each 1 vs. 1 with Best Buy.\n" +
                "*The end result is an informed Blue Shirt regarding the competition and the value-add propositions that Best Buy offers that the competitors do not.");
        case3.setAppType(1);
        case3.setClient("BestBuy");
        case3.setKeyHeight("TBD");
        case3.setSolution("TBD");
        case3.setResult("unknown");
        case3.setStartTime("test startTime");
        case3.setEndTime("test endTime");
        case3.setendPoint("test endPoint");

        
        
        //case4
        Case case4 = new Case();
        case4.setId(4);
        case4.setTitle("PC Upgrade");
        case4.setDesc("*Give Blue Shirts the ability to help customers make more informed decisions regarding their PC purchases.  One front-end to be usable from all the major browsers including the big 3 mobile platforms (Android, iOS, and Windows 8).");
        case4.setAppType(1);
        case4.setClient("unknown");
        case4.setKeyHeight("*Blue Shirt uses sliders to input how the customer will use the PC/Laptop that they are searching for\n" +
                "*The application filters all products offered by Best Buy and shows those that match the intended uses.\n" +
                "*Customer can specify the price range.\n" +
                "*Customer can narrow down the search results by entering additional criteria (i.e. “Has SSD Hard Drive”, “Has Blu-Ray drive”, etc.)\n" +
                "*Each product will display if it is available Online only or is available in the current store");
        case4.setSolution("*HTML5/CSS3, jQuery Mobile, Backbone.js\n" +
                "*JQuery Mobile as the widget set used and Backbone.js as the object system to glue the app together.  \n" +
                "*JQuery Mobile was chosen because it made promises about interoperability, which it delivered on, though it being an html5 library it does not support IE8, which was fine for our given needs.  \n" +
                "*All mark-up and JavaScript code is delivered upon the first page load, the only data being delivered after that point is images for specific products and json-objects as requested to drive the front-end logic.  ");
        case4.setResult("unknown");
        case4.setStartTime("test startTime");
        case4.setEndTime("test endTime");
        case4.setendPoint("test endPoint");

       

        //case5
        Case case5 = new Case();
        case5.setId(5);
        case5.setTitle("Weekly Ad");
        case5.setDesc("*Customer goes to local Best Buy for a specific deal found in the electronic deals newsletter but that product is out of stock… what should the Blue Shirt do?!\n" +
                "\n" +
                "*Application will search availability in the store for each deal found in the newsletter and display those products that are out of stock or very low in stock\n" +
                "*Out of stock items will display the nearby stores that have the product as well as any alternate SKUs that are available at the store.\n" +
                "*Application can sort by category to show only specific products to the respective department employees\n" +
                "*All products will be searched and stored in DB in the morning but can be refreshed “on-demand” throughout the day");
        case5.setAppType(1);
        case5.setClient("unknown");
        case5.setKeyHeight("*Currently live in 1000 Best Buy stores\n" +
                "*Application updates store inventory (at all active stores) every 3 hours for all products found in the Weekly Ad circular\n" +
                "*Application can be viewed on PC browser as well as all major tablet OSes (Android / iOS / Windows)\n" +
                "*Gives store associates immediate feedback regarding in-stock products\n" +
                "*Recommends nearby stores or comparable in-stock products if an item is Out of Stock\n" +
                "*Helps encourage a sale when a certain product is unavailable");
        case5.setSolution("*UI built with Object-Oriented JavaScript and enhanced with jQuery and jQuery UI\n" +
                "*UI handles front-end for store selection, categories, product details and map\n" +
                "*Bing Maps API\n" +
                "*Integration with SOAP and RESTful Web Services");
        case5.setResult("unknown");
        case5.setStartTime("test startTime");
        case5.setEndTime("test endTime");
        case5.setendPoint("test endPoint");

        Screenshot case0overview = new Screenshot();
        case0overview.setId(0);
        case0overview.setPath(R.drawable.homeconnection0);

        Screenshot case1overview = new Screenshot();
        case1overview.setId(1);
        case1overview.setPath(R.drawable.fms0);

        Screenshot case2overview = new Screenshot();
        case2overview.setId(2);
        case2overview.setPath(R.drawable.gsa0);

        Screenshot case3overview = new Screenshot();
        case3overview.setId(3);
        case3overview.setPath(R.drawable.comp_shop0);

        Screenshot case4overview = new Screenshot();
        case4overview.setId(4);
        case4overview.setPath(R.drawable.pc_upgrade0);

        Screenshot case5overview = new Screenshot();
        case5overview.setId(5);
        case5overview.setPath(R.drawable.weekly_ad0);
        
        Screenshot case0img1 = new Screenshot();
        case0img1.setId(6);
        case0img1.setPath(R.drawable.homeconnection1);

        Screenshot case1img1 = new Screenshot();
        case1img1.setId(7);
        case1img1.setPath(R.drawable.fms1);

        Screenshot case1img2 = new Screenshot();
        case1img2.setId(8);
        case1img2.setPath(R.drawable.fms2);

        Screenshot case1img3 = new Screenshot();
        case1img3.setId(9);
        case1img3.setPath(R.drawable.fms3);

        Screenshot case1img4 = new Screenshot();
        case1img4.setId(10);
        case1img4.setPath(R.drawable.fms4);

        Screenshot case2img1 = new Screenshot();
        case2img1.setId(11);
        case2img1.setPath(R.drawable.gsa1);

        Screenshot case2img2 = new Screenshot();
        case2img2.setId(12);
        case2img2.setPath(R.drawable.gsa2);

        Screenshot case3img1 = new Screenshot();
        case3img1.setId(13);
        case3img1.setPath(R.drawable.comp_shop1);

        Screenshot case3img2 = new Screenshot();
        case3img2.setId(14);
        case3img2.setPath(R.drawable.comp_shop2);

        Screenshot case3img3 = new Screenshot();
        case3img3.setId(15);
        case3img3.setPath(R.drawable.comp_shop3);

        Screenshot case3img4 = new Screenshot();
        case3img4.setId(15);
        case3img4.setPath(R.drawable.comp_shop4);

        Screenshot case3img5 = new Screenshot();
        case3img5.setId(16);
        case3img5.setPath(R.drawable.comp_shop5);

        Screenshot case3img6 = new Screenshot();
        case3img6.setId(17);
        case3img6.setPath(R.drawable.comp_shop6);

        Screenshot case3img7 = new Screenshot();
        case3img7.setId(18);
        case3img7.setPath(R.drawable.comp_shop7);

        Screenshot case3img8 = new Screenshot();
        case3img8.setId(19);
        case3img8.setPath(R.drawable.comp_shop8);

        Screenshot case3img9 = new Screenshot();
        case3img9.setId(20);
        case3img9.setPath(R.drawable.comp_shop9);

        Screenshot case3img10 = new Screenshot();
        case3img10.setId(21);
        case3img10.setPath(R.drawable.comp_shop10);

        Screenshot case3img11 = new Screenshot();
        case3img11.setId(22);
        case3img11.setPath(R.drawable.comp_shop11);

        Screenshot case4img1 = new Screenshot();
        case4img1.setId(23);
        case4img1.setPath(R.drawable.pc_upgrade1);

        Screenshot case4img2 = new Screenshot();
        case4img2.setId(24);
        case4img2.setPath(R.drawable.pc_upgrade2);

        Screenshot case4img3 = new Screenshot();
        case4img3.setId(25);
        case4img3.setPath(R.drawable.pc_upgrade3);

        Screenshot case4img4 = new Screenshot();
        case4img4.setId(26);
        case4img4.setPath(R.drawable.pc_upgrade4);

        Screenshot case4img5 = new Screenshot();
        case4img5.setId(27);
        case4img5.setPath(R.drawable.pc_upgrade5);

        Screenshot case4img6 = new Screenshot();
        case4img6.setId(28);
        case4img6.setPath(R.drawable.pc_upgrade6);

        Screenshot case4img7 = new Screenshot();
        case4img7.setId(29);
        case4img7.setPath(R.drawable.pc_upgrade7);

        Screenshot case5img1 = new Screenshot();
        case5img1.setId(30);
        case5img1.setPath(R.drawable.weekly_ad1);

        Screenshot case5img2 = new Screenshot();
        case5img2.setId(31);
        case5img2.setPath(R.drawable.weekly_ad2);

        Screenshot case5img3 = new Screenshot();
        case5img3.setId(32);
        case5img3.setPath(R.drawable.weekly_ad3);

        Screenshot case5img4 = new Screenshot();
        case5img4.setId(33);
        case5img4.setPath(R.drawable.weekly_ad4);


        //Filters
        Filter filter0 = new Filter();
        filter0.setId(0);
        filter0.setFilterName("HTML5");

        Filter filter1 = new Filter();
        filter1.setId(1);
        filter1.setFilterName("CSS");

        Filter filter2 = new Filter();
        filter2.setId(2);
        filter2.setFilterName("JavaScript");

        Filter filter3 = new Filter();
        filter3.setId(3);
        filter3.setFilterName("Android");

        Filter filter4 = new Filter();
        filter4.setId(4);

        filter4.setFilterName("iOS");

        Filter filter5 = new Filter();
        filter5.setId(5);
        filter5.setFilterName(".NET");

        Filter filter6 = new Filter();
        filter6.setId(6);
        filter6.setFilterName("Java");

        Filter filter7 = new Filter();
        filter7.setId(7);
        filter7.setFilterName("Web App");

        Filter filter8 = new Filter();
        filter8.setId(8);
        filter8.setFilterName("Native");

        Filter filter9 = new Filter();
        filter9.setId(9);
        filter9.setFilterName("Windows8");

        Filter filter10 = new Filter();
        filter10.setId(10);
        filter10.setFilterName("Objective-C");

        Filter filter11 = new Filter();
        filter11.setId(11);
        filter11.setFilterName("Responsive");

        Filter filter12 = new Filter();
        filter12.setId(12);
        filter12.setFilterName("Desktop");

        //Case-Screenshot
        CaseScreenshot cs0 = new CaseScreenshot();
        cs0.setId(0);
        cs0.setCaseId(0);
        cs0.setScreenshotId(0);

        CaseScreenshot cs1 = new CaseScreenshot();
        cs1.setId(1);
        cs1.setCaseId(0);
        cs1.setScreenshotId(6);

        CaseScreenshot cs2 = new CaseScreenshot();
        cs2.setId(2);
        cs2.setCaseId(1);
        cs2.setScreenshotId(1);

        CaseScreenshot cs3 = new CaseScreenshot();
        cs3.setId(3);
        cs3.setCaseId(1);
        cs3.setScreenshotId(7);

        CaseScreenshot cs4 = new CaseScreenshot();
        cs4.setId(4);
        cs4.setCaseId(1);
        cs4.setScreenshotId(8);

        CaseScreenshot cs5 = new CaseScreenshot();
        cs5.setId(5);
        cs5.setCaseId(1);
        cs5.setScreenshotId(9);

        CaseScreenshot cs6 = new CaseScreenshot();
        cs6.setId(6);
        cs6.setCaseId(1);
        cs6.setScreenshotId(10);

        CaseScreenshot cs7 = new CaseScreenshot();
        cs7.setId(7);
        cs7.setCaseId(2);
        cs7.setScreenshotId(2);

        CaseScreenshot cs8 = new CaseScreenshot();
        cs8.setId(8);
        cs8.setCaseId(2);
        cs8.setScreenshotId(11);

        CaseScreenshot cs9 = new CaseScreenshot();
        cs9.setId(9);
        cs9.setCaseId(2);
        cs9.setScreenshotId(12);

        CaseScreenshot cs10 = new CaseScreenshot();
        cs10.setId(10);
        cs10.setCaseId(3);
        cs10.setScreenshotId(3);

        CaseScreenshot cs11 = new CaseScreenshot();
        cs11.setId(11);
        cs11.setCaseId(3);
        cs11.setScreenshotId(13);

        CaseScreenshot cs12 = new CaseScreenshot();
        cs12.setId(12);
        cs12.setCaseId(3);
        cs12.setScreenshotId(14);

        CaseScreenshot cs13 = new CaseScreenshot();
        cs13.setId(13);
        cs13.setCaseId(3);
        cs13.setScreenshotId(15);

        CaseScreenshot cs14 = new CaseScreenshot();
        cs14.setId(14);
        cs14.setCaseId(3);
        cs14.setScreenshotId(16);

        CaseScreenshot cs15 = new CaseScreenshot();
        cs15.setId(15);
        cs15.setCaseId(3);
        cs15.setScreenshotId(17);

        CaseScreenshot cs16 = new CaseScreenshot();
        cs16.setId(16);
        cs16.setCaseId(3);
        cs16.setScreenshotId(18);

        CaseScreenshot cs17 = new CaseScreenshot();
        cs17.setId(17);
        cs17.setCaseId(3);
        cs17.setScreenshotId(19);

        CaseScreenshot cs18 = new CaseScreenshot();
        cs18.setId(18);
        cs18.setCaseId(3);
        cs18.setScreenshotId(20);

        CaseScreenshot cs19 = new CaseScreenshot();
        cs19.setId(19);
        cs19.setCaseId(3);
        cs19.setScreenshotId(21);

        CaseScreenshot cs20 = new CaseScreenshot();
        cs20.setId(20);
        cs20.setCaseId(3);
        cs20.setScreenshotId(22);

        CaseScreenshot cs21 = new CaseScreenshot();
        cs21.setId(21);
        cs21.setCaseId(4);
        cs21.setScreenshotId(4);

        CaseScreenshot cs22 = new CaseScreenshot();
        cs22.setId(22);
        cs22.setCaseId(4);
        cs22.setScreenshotId(23);

        CaseScreenshot cs23 = new CaseScreenshot();
        cs23.setId(23);
        cs23.setCaseId(4);
        cs23.setScreenshotId(24);

        CaseScreenshot cs24 = new CaseScreenshot();
        cs24.setId(24);
        cs24.setCaseId(4);
        cs24.setScreenshotId(25);

        CaseScreenshot cs25 = new CaseScreenshot();
        cs25.setId(25);
        cs25.setCaseId(4);
        cs25.setScreenshotId(26);

        CaseScreenshot cs26 = new CaseScreenshot();
        cs26.setId(26);
        cs26.setCaseId(4);
        cs26.setScreenshotId(27);

        CaseScreenshot cs27 = new CaseScreenshot();
        cs27.setId(27);
        cs27.setCaseId(4);
        cs27.setScreenshotId(28);

        CaseScreenshot cs28 = new CaseScreenshot();
        cs28.setId(28);
        cs28.setCaseId(4);
        cs28.setScreenshotId(29);

        CaseScreenshot cs29 = new CaseScreenshot();
        cs29.setId(29);
        cs29.setCaseId(5);
        cs29.setScreenshotId(5);

        CaseScreenshot cs30 = new CaseScreenshot();
        cs30.setId(30);
        cs30.setCaseId(5);
        cs30.setScreenshotId(30);

        CaseScreenshot cs31 = new CaseScreenshot();
        cs31.setId(31);
        cs31.setCaseId(5);
        cs31.setScreenshotId(31);

        CaseScreenshot cs32 = new CaseScreenshot();
        cs32.setId(32);
        cs32.setCaseId(5);
        cs32.setScreenshotId(32);

        CaseScreenshot cs33 = new CaseScreenshot();
        cs33.setId(33);
        cs33.setCaseId(5);
        cs33.setScreenshotId(33);



        //Case-Filter
        CaseFilter cf0 = new CaseFilter();
        cf0.setId(0);
        cf0.setCaseId(0);
        cf0.setFilterId(5);

        CaseFilter cf1 = new CaseFilter();
        cf1.setId(1);
        cf1.setCaseId(0);
        cf1.setFilterId(8);

        CaseFilter cf2 = new CaseFilter();
        cf2.setId(2);
        cf2.setCaseId(1);
        cf2.setFilterId(3);

        CaseFilter cf3 = new CaseFilter();
        cf3.setId(3);
        cf3.setCaseId(1);
        cf3.setFilterId(6);

        CaseFilter cf4 = new CaseFilter();
        cf4.setId(4);
        cf4.setCaseId(1);
        cf4.setFilterId(8);

        CaseFilter cf5 = new CaseFilter();
        cf5.setId(5);
        cf5.setCaseId(2);
        cf5.setFilterId(3);

        CaseFilter cf6 = new CaseFilter();
        cf6.setId(6);
        cf6.setCaseId(2);
        cf6.setFilterId(4);

        CaseFilter cf7 = new CaseFilter();
        cf7.setId(7);
        cf7.setCaseId(2);
        cf7.setFilterId(5);

        CaseFilter cf8 = new CaseFilter();
        cf8.setId(8);
        cf8.setCaseId(2);
        cf8.setFilterId(6);

        CaseFilter cf9 = new CaseFilter();
        cf9.setId(9);
        cf9.setCaseId(2);
        cf9.setFilterId(8);

        CaseFilter cf10 = new CaseFilter();
        cf10.setId(10);
        cf10.setCaseId(2);
        cf10.setFilterId(9);

        CaseFilter cf11 = new CaseFilter();
        cf11.setId(11);
        cf11.setCaseId(2);
        cf11.setFilterId(10);

        CaseFilter cf12 = new CaseFilter();
        cf12.setId(12);
        cf12.setCaseId(3);
        cf12.setFilterId(3);

        CaseFilter cf13 = new CaseFilter();
        cf13.setId(13);
        cf13.setCaseId(3);
        cf13.setFilterId(6);

        CaseFilter cf14 = new CaseFilter();
        cf14.setId(14);
        cf14.setCaseId(3);
        cf14.setFilterId(8);

        CaseFilter cf15 = new CaseFilter();
        cf14.setId(14);
        cf14.setCaseId(4);
        cf14.setFilterId(0);

        CaseFilter cf16 = new CaseFilter();
        cf16.setId(16);
        cf16.setCaseId(4);
        cf16.setFilterId(1);

        CaseFilter cf17 = new CaseFilter();
        cf17.setId(17);
        cf17.setCaseId(4);
        cf17.setFilterId(2);

        CaseFilter cf18 = new CaseFilter();
        cf18.setId(18);
        cf18.setCaseId(4);
        cf18.setFilterId(11);

        CaseFilter cf19 = new CaseFilter();
        cf19.setId(19);
        cf19.setCaseId(4);
        cf19.setFilterId(12);

        CaseFilter cf20 = new CaseFilter();
        cf20.setId(20);
        cf20.setCaseId(5);
        cf20.setFilterId(0);

        CaseFilter cf21 = new CaseFilter();
        cf21.setId(21);
        cf21.setCaseId(5);
        cf21.setFilterId(1);

        CaseFilter cf22 = new CaseFilter();
        cf22.setId(22);
        cf22.setCaseId(5);
        cf22.setFilterId(2);

        CaseFilter cf23 = new CaseFilter();
        cf23.setId(23);
        cf23.setCaseId(5);
        cf23.setFilterId(11);

        CaseFilter cf24 = new CaseFilter();
        cf24.setId(24);
        cf24.setCaseId(5);
        cf24.setFilterId(12);


        dbHelper.addCase(case0);
        dbHelper.addCase(case1);
        dbHelper.addCase(case2);
        dbHelper.addCase(case3);
        dbHelper.addCase(case4);
        dbHelper.addCase(case5);

        dbHelper.addScreenshot(case0overview);
        dbHelper.addScreenshot(case1overview);
        dbHelper.addScreenshot(case2overview);
        dbHelper.addScreenshot(case3overview);
        dbHelper.addScreenshot(case4overview);
        dbHelper.addScreenshot(case5overview);
        dbHelper.addScreenshot(case0img1);
        dbHelper.addScreenshot(case1img1);
        dbHelper.addScreenshot(case1img2);
        dbHelper.addScreenshot(case1img3);
        dbHelper.addScreenshot(case1img4);
        dbHelper.addScreenshot(case2img1);
        dbHelper.addScreenshot(case2img2);
        dbHelper.addScreenshot(case3img1);
        dbHelper.addScreenshot(case3img2);
        dbHelper.addScreenshot(case3img3);
        dbHelper.addScreenshot(case3img4);
        dbHelper.addScreenshot(case3img5);
        dbHelper.addScreenshot(case3img6);
        dbHelper.addScreenshot(case3img7);
        dbHelper.addScreenshot(case3img8);
        dbHelper.addScreenshot(case3img9);
        dbHelper.addScreenshot(case3img10);
        dbHelper.addScreenshot(case3img11);
        dbHelper.addScreenshot(case4img1);
        dbHelper.addScreenshot(case4img2);
        dbHelper.addScreenshot(case4img3);
        dbHelper.addScreenshot(case4img4);
        dbHelper.addScreenshot(case4img5);
        dbHelper.addScreenshot(case4img6);
        dbHelper.addScreenshot(case4img7);
        dbHelper.addScreenshot(case5img1);
        dbHelper.addScreenshot(case5img2);
        dbHelper.addScreenshot(case5img3);
        dbHelper.addScreenshot(case5img4);

        dbHelper.addFilter(filter0);
        dbHelper.addFilter(filter1);
        dbHelper.addFilter(filter2);
        dbHelper.addFilter(filter3);
        dbHelper.addFilter(filter4);
        dbHelper.addFilter(filter5);
        dbHelper.addFilter(filter6);
        dbHelper.addFilter(filter7);
        dbHelper.addFilter(filter8);
        dbHelper.addFilter(filter9);
        dbHelper.addFilter(filter10);
        dbHelper.addFilter(filter11);
        dbHelper.addFilter(filter12);

        dbHelper.addCaseScreenshot(cs0);
        dbHelper.addCaseScreenshot(cs1);
        dbHelper.addCaseScreenshot(cs2);
        dbHelper.addCaseScreenshot(cs3);
        dbHelper.addCaseScreenshot(cs4);
        dbHelper.addCaseScreenshot(cs5);
        dbHelper.addCaseScreenshot(cs6);
        dbHelper.addCaseScreenshot(cs7);
        dbHelper.addCaseScreenshot(cs8);
        dbHelper.addCaseScreenshot(cs9);
        dbHelper.addCaseScreenshot(cs10);
        dbHelper.addCaseScreenshot(cs11);
        dbHelper.addCaseScreenshot(cs12);
        dbHelper.addCaseScreenshot(cs13);
        dbHelper.addCaseScreenshot(cs14);
        dbHelper.addCaseScreenshot(cs15);
        dbHelper.addCaseScreenshot(cs16);
        dbHelper.addCaseScreenshot(cs17);
        dbHelper.addCaseScreenshot(cs18);
        dbHelper.addCaseScreenshot(cs19);
        dbHelper.addCaseScreenshot(cs20);
        dbHelper.addCaseScreenshot(cs21);
        dbHelper.addCaseScreenshot(cs22);
        dbHelper.addCaseScreenshot(cs23);
        dbHelper.addCaseScreenshot(cs24);
        dbHelper.addCaseScreenshot(cs25);
        dbHelper.addCaseScreenshot(cs26);
        dbHelper.addCaseScreenshot(cs27);
        dbHelper.addCaseScreenshot(cs28);
        dbHelper.addCaseScreenshot(cs29);
        dbHelper.addCaseScreenshot(cs30);
        dbHelper.addCaseScreenshot(cs31);
        dbHelper.addCaseScreenshot(cs32);
        dbHelper.addCaseScreenshot(cs33);

        dbHelper.addCaseFilter(cf0);
        dbHelper.addCaseFilter(cf1);
        dbHelper.addCaseFilter(cf2);
        dbHelper.addCaseFilter(cf3);
        dbHelper.addCaseFilter(cf4);
        dbHelper.addCaseFilter(cf5);
        dbHelper.addCaseFilter(cf6);
        dbHelper.addCaseFilter(cf7);
        dbHelper.addCaseFilter(cf8);
        dbHelper.addCaseFilter(cf9);
        dbHelper.addCaseFilter(cf10);
        dbHelper.addCaseFilter(cf11);
        dbHelper.addCaseFilter(cf12);
        dbHelper.addCaseFilter(cf13);
        dbHelper.addCaseFilter(cf14);
        dbHelper.addCaseFilter(cf15);
        dbHelper.addCaseFilter(cf16);
        dbHelper.addCaseFilter(cf17);
        dbHelper.addCaseFilter(cf18);
        dbHelper.addCaseFilter(cf19);
        dbHelper.addCaseFilter(cf20);
        dbHelper.addCaseFilter(cf21);
        dbHelper.addCaseFilter(cf22);
        dbHelper.addCaseFilter(cf23);
        dbHelper.addCaseFilter(cf24);
    }

}
