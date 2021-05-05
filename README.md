# qe-tech-challenge

Welcome to our Quality Engineering Technical challenge. The purpose of this challenge allows you to demonstrate your skills and show us why you are the one.

## The Challenge

Develop a UI & API test automation framework and create tests within this framework as outlined below --

1. Visit Vodafone's online Postpaid SIM only page https://www.vodafone.com.au/plans/sim-only. 
2. Send a GET request to https://api-prod.prod.cms.df.services.vodafone.com.au/plan/postpaid-simo?serviceType=New.
3. Validate if for all plans cta ('Add to cart' button) in the UI matches with the ctaLabel field (under planListing/plans/)from the above GET request in Step 2.
4. Select any plan and validate if the price shown in sticky cart is same as the plan selected.
5. Proceed to cart and validate if cart page is shown with the correct product.


## Guidelines

Use **your preferred programming language and tool**. However, our preferred tool is **Cypress** programming language is **Javascript** 

### Steps

- Create your own Github repository and make [Abhilash-Srinivasa and as14gz](https://github.com/asanchezgiraldo) a read-only collaborator.
- Create a README.md file explaining how to execute your test.
- Run your test in any CI (such as Gitlab, CircleCI etc) that can be accessed by anyone
- Ensure writing a clean code and showcase reusability and maintenance of tests.
- Complete within 3 days of your interview.
