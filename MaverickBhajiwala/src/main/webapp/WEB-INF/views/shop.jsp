<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html lang="en">
<body class="goto-here">
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>

	<%-- <div class="hero-wrap hero-bread" style="background-image: url('${pageContext.request.contextPath}/resources/images/bg_1.jpg');">
      <div class="container">
        <div class="row no-gutters slider-text align-items-center justify-content-center">
          <div class="col-md-9 ftco-animate text-center fadeInUp ftco-animated">
          	<p class="breadcrumbs"><span class="mr-2"><a href="index.html">Home</a></span> <span>Products</span></p>
            <h1 class="mb-0 bread">Products</h1>
          </div>
        </div>
      </div>
    </div> --%>

	<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-10 mb-5 text-center">
					<ul class="product-category" id="parent_element_of_links">
						<li><a
							href="${pageContext.request.contextPath}/shop/shopPage/0/12/0">All</a></li>
						<c:forEach items="${productCategoryList}"
							var="productCategoryList" varStatus="count">
							<li><a
								href="${pageContext.request.contextPath}/shop/shopPage/0/12/${productCategoryList.getId()}">${productCategoryList.getName()}</a></li>
						</c:forEach>
					</ul>
				</div>
			</div>
			<div class="row">
				<c:forEach items="${productList}" var="productList"
					varStatus="count">
					<div class="col-md-6 col-lg-3 ftco-animate">
						<div class="product">
							<a href="${pageContext.request.contextPath}/singleproduct/getProductDetails/${productList.getId()}" class="img-prod"><img class="img-fluid"
								src="${pageContext.request.contextPath}/resources/images/product-${count.index+1 }.jpg"
								alt="Colorlib Template"> <span class="status">${productList.getOffer().getDiscount()}%</span>
								<div class="overlay"></div> </a>
							<div class="text py-3 pb-4 px-3 text-center">
								<h3>
									<a href="#">${productList.getProductSubCategory().getName()}</a>
								</h3>
								<div class="d-flex">
									<div class="pricing">
										<p class="price">
											<%-- <span class="mr-2 price-dc">${productList.getPrice()}</span> --%>
											<span class="price-sale">${productList.getPrice()}</span>
										</p>
									</div>
								</div>
								<div class="bottom-area d-flex px-3">
									<div class="m-auto d-flex">
										<a href="#"
											class="add-to-cart d-flex justify-content-center align-items-center text-center">
											<span><i class="ion-ios-menu"></i></span>
										</a> <a href="#"
											class="buy-now d-flex justify-content-center align-items-center mx-1">
											<span><i class="ion-ios-cart"></i></span>
										</a> <a href="#"
											class="heart d-flex justify-content-center align-items-center ">
											<span><i class="ion-ios-heart"></i></span>
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
			<div class="row mt-5">
				<div class="col text-center">
					<div class="block-27">
						<ul>
							<li><a href="#">&lt;</a></li>

					
							<c:forEach begin="1" end="${pagesCount}" varStatus="loop">

								<li><a href="${pageContext.request.contextPath}/shop/shopPage/${loop.index-1}/12/${productCategoryId}">${loop.index}</a></li>

							</c:forEach>

							<li><a href="#">&gt;</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="ftco-section ftco-no-pt ftco-no-pb py-5 bg-light">
		<div class="container py-4">
			<div class="row d-flex justify-content-center py-5">
				<div class="col-md-6">
					<h2 style="font-size: 22px;" class="mb-0">Subcribe to our
						Newsletter</h2>
					<span>Get e-mail updates about our latest shops and special
						offers</span>
				</div>
				<div class="col-md-6 d-flex align-items-center">
					<form action="#" class="subscribe-form">
						<div class="form-group d-flex">
							<input type="text" class="form-control"
								placeholder="Enter email address"> <input type="submit"
								value="Subscribe" class="submit px-3">
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="/WEB-INF/views/common/footer.jsp"></jsp:include>
	<script type="text/javascript">
		  $('#parent_element_of_links a').click(function(e) {
			//e.preventDefault();
			$('#parent_element_of_links a').removeClass('active');
			$(this).addClass('active');
		
		});  

		

		
	</script>

</body>
</html>