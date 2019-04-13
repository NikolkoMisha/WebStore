<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="custom"%>


		<form:form class="form-horizontal" action="/model/setting" method="POST" modelAttribute="setting">
  						<custom:hiddenInputs excludeParams="model, count, name, phone"/>
  							
  				<table class="table">
						<tr >
							<td class="table_foto"><div class="div_setting_foto"><a href="/model/setting/${type.id}"><img src="/images/type/${type.id}.jpg?version=${type.version}" width="100%"></a></div></td>
							<td class="table_name"><div class="div_setting_name">${type.name} ${type.memory.name} ${type.color.name}</div></td>
							<td class="table_count"><div class="div_setting_count">
				      						<form:select class="form-control" path="count" id="count"
				      						  itemValue="id" itemLabel="name" >
				      						 	<form:option value="1">1</form:option><form:option value="2">2</form:option> <form:option value="3">3</form:option>
				      						 	<form:option value="4">4</form:option><form:option value="5">5</form:option><form:option value="6">6</form:option>
				      						 	<form:option value="7">7</form:option><form:option value="8">8</form:option><form:option value="9">9</form:option>
				      						 	<form:option value="10">10</form:option><form:option value="11">11</form:option><form:option value="12">12</form:option>
				      						 	<form:option value="13">13</form:option><form:option value="14">14</form:option><form:option value="15">15</form:option>
				      						 	<form:option value="16">16</form:option><form:option value="17">17</form:option><form:option value="18">18</form:option>
				      						 	<form:option value="19">19</form:option><form:option value="20">20</form:option><form:option value="21">21</form:option>
				      						 	<form:option value="22">22</form:option><form:option value="23">23</form:option><form:option value="24">24</form:option>
				      						 	<form:option value="25">25</form:option><form:option value="26">26</form:option><form:option value="27">27</form:option>
				      						 	<form:option value="28">28</form:option><form:option value="29">29</form:option><form:option value="30">30</form:option>
				      						 	<form:option value="31">31</form:option><form:option value="32">32</form:option><form:option value="33">33</form:option>
				      						 	<form:option value="34">34</form:option><form:option value="35">35</form:option><form:option value="36">36</form:option>
				      						 	<form:option value="37">37</form:option><form:option value="38">38</form:option><form:option value="39">39</form:option>
				      						 	<form:option value="40">40</form:option><form:option value="41">41</form:option><form:option value="42">42</form:option>
				      						 	<form:option value="43">43</form:option><form:option value="44">44</form:option><form:option value="45">45</form:option>
				      						 	<form:option value="46">46</form:option><form:option value="47">47</form:option><form:option value="48">48</form:option>
				      						 	<form:option value="49">49</form:option><form:option value="50">50</form:option><form:option value="51">51</form:option>
				      						 	<form:option value="52">52</form:option><form:option value="53">53</form:option><form:option value="54">54</form:option>
				      						 	<form:option value="55">55</form:option><form:option value="56">56</form:option><form:option value="57">57</form:option>
				      						 	<form:option value="58">58</form:option><form:option value="59">59</form:option><form:option value="60">60</form:option>
				      						 	<form:option value="61">61</form:option><form:option value="62">62</form:option><form:option value="63">63</form:option>
				      						 	<form:option value="64">64</form:option><form:option value="65">65</form:option><form:option value="66">66</form:option>
				      						 	<form:option value="67">67</form:option><form:option value="68">68</form:option><form:option value="69">69</form:option>
				      						 	<form:option value="70">70</form:option><form:option value="71">71</form:option><form:option value="72">72</form:option>
				      						 	<form:option value="73">73</form:option><form:option value="74">74</form:option><form:option value="75">75</form:option>
				      						 	<form:option value="76">76</form:option><form:option value="77">77</form:option><form:option value="78">78</form:option>
				      						 	<form:option value="79">79</form:option><form:option value="80">80</form:option><form:option value="81">81</form:option>
				      						 	<form:option value="82">82</form:option><form:option value="83">83</form:option><form:option value="84">84</form:option>
				      						 	<form:option value="85">85</form:option><form:option value="86">86</form:option><form:option value="87">87</form:option>
				      						 	<form:option value="88">88</form:option><form:option value="89">89</form:option><form:option value="90">90</form:option>
				      						 	<form:option value="91">91</form:option><form:option value="92">92</form:option><form:option value="93">93</form:option>
				      						 	<form:option value="94">94</form:option><form:option value="95">95</form:option><form:option value="96">96</form:option>
				      						 	<form:option value="97">97</form:option><form:option value="98">98</form:option><form:option value="99">99</form:option>
				      						 	<form:option value="100">100</form:option>
				      						 </form:select>
				    					</div>
				    			<div class="div_setting_count_text"><label for="count"  style="color:#fff">шт.</label></div>
				    		</td>
							<td class="table_price"><div class="div_setting_price">${type.price} грн / шт.</div></td>
						</tr>
				</table>
  							
  			
  					<div class="form-group">
						<label for="model" class="col-sm-offset-1 col-sm-1 control-label" style="color:#fff;">Модель</label>
	    					<div class="col-sm-2">
	      						<form:select class="form-control" path="model" id="model"
	      						 items="${models}" itemValue="id" itemLabel="name" />
	    					</div>	
						<label for="name" class="col-sm-1 control-label" style="color:#fff">Ім'я</label>
    					<div class="col-sm-2">
      						<form:input type="text" class="form-control" path="name" id="name"/>
    					</div>
    					<label for="phone" class="col-sm-1 control-label" style="color:#fff">Телефон</label>
    					<div class="col-sm-2">
      						<form:input type="text" class="form-control" path="phone" id="phone"/>
    					</div>
    				</div>
    				<div class="form-group">
    					<div class="col-sm-offset-2 col-sm-5">
      						<button type="submit" class="btn btn-success">Оформити замовлення</button>
    					</div>
  				</div>
  		</form:form>