<#include "../layouts/header.ftl">
<#include "../layouts/sidebar.ftl">
<#include "../layouts/topNav.ftl">

<!-- page content -->
<div class="right_col" role="main">
    <div class="">
        <div class="page-title">
            <div class="title_left">
                <h3>活动模版管理 <small></small></h3>
            </div>

            <div class="title_right">
                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="搜索 ...">
                        <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Go!</button>
                    </span>
                    </div>
                </div>
            </div>
        </div>

        <div class="clearfix"></div>

        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>模版</h2>
                        <div class="clearfix"></div>
                    </div>

                    <div class="x_content">
                        <#--<p>Add class <code>bulk_action</code> to table for bulk actions options on row select</p>-->
                        <div class="table-responsive">
                            <table class="table table-striped jambo_table bulk_action">
                                <thead>
                                <tr class="headings">
                                    <th class="column-title"> 活动名称 </th>
                                    <th class="column-title"> 创建时间 </th>
                                    <th class="column-title"> 商家使用数 </th>
                                    <th class="column-title"> 网民使用数 </th>
                                    <th class="column-title no-link last"><span class="nobr">适应行业</span></th>
                                    <th> 操作 </th>
                                </tr>
                                </thead>

                                <tbody>
                                <tr class="even pointer">
                                    <td class=" ">121000040</td>
                                    <td class=" ">May 23, 2014 11:47:56 PM </td>
                                    <td class=" ">121000210 <i class="success fa fa-long-arrow-up"></i></td>
                                    <td class=" ">John Blank L</td>
                                    <td class=" ">Paid</td>
                                    <td class="a-center ">
                                        <a href="#" class="btn btn-info btn-xs">修改</a>
                                        <button class="btn btn-danger btn-xs">下架</button>
                                        <button class="btn btn-primary btn-xs">推荐</button>
                                    </td>
                                </tr>
                                <tr class="odd pointer">
                                    <td class=" ">121000039</td>
                                    <td class=" ">May 23, 2014 11:30:12 PM</td>
                                    <td class=" ">121000208 <i class="success fa fa-long-arrow-up"></i>
                                    </td>
                                    <td class=" ">John Blank L</td>
                                    <td class="a-right a-right ">$741.20</td>
                                    <td class="a-center ">
                                        <a href="#" class="btn btn-info btn-xs">修改</a>
                                        <button class="btn btn-danger btn-xs">下架</button>
                                        <button class="btn btn-primary btn-xs">推荐</button>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>


                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /page content -->
<#include "../layouts/footer.ftl">
