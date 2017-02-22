<#include "../layouts/header.ftl">
<#include "../layouts/sidebar.ftl">
<#include "../layouts/topNav.ftl">

<!-- page content -->
<div class="right_col" role="main">
    <div class="">
        <div class="page-title">
            <div class="title_left">
                <h3>活动行业管理</h3>
            </div>

            <div class="title_right">
                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                    <form action="/activity/industry" method="get">
                        <div class="input-group">
                            <input type="text" class="form-control" name="name" value="${name!}" placeholder="搜索...">
                            <span class="input-group-btn">
                          <button class="btn btn-default" type="button">Go!</button>
                        </span>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <div class="clearfix"></div>

        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <#--<div class="x_title">-->
                        <#--<h2>Table design <small>Custom design</small></h2>-->
                        <#--<ul class="nav navbar-right panel_toolbox">-->
                            <#--<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>-->
                            <#--</li>-->
                            <#--<li class="dropdown">-->
                                <#--<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>-->
                                <#--<ul class="dropdown-menu" role="menu">-->
                                    <#--<li><a href="#">Settings 1</a>-->
                                    <#--</li>-->
                                    <#--<li><a href="#">Settings 2</a>-->
                                    <#--</li>-->
                                <#--</ul>-->
                            <#--</li>-->
                            <#--<li><a class="close-link"><i class="fa fa-close"></i></a>-->
                            <#--</li>-->
                        <#--</ul>-->
                        <#--<div class="clearfix"></div>-->
                    <#--</div>-->

                        <div class="x_title">
                            <button class="btn btn-primary btn-sm">添加行业</button>
                        </div>

                    <div class="x_content">
                        <div class="table-responsive">
                            <table class="table table-striped jambo_table bulk_action">
                                <thead>
                                <tr class="headings">
                                    <th class="column-title" width="10%">ID </th>
                                    <th class="column-title" >名称 </th>
                                    <th class="column-title">创建时间 </th>
                                    <th class="column-title no-link last" width="20%"><span class="nobr">操作</span></th>
                                </tr>
                                </thead>

                                <tbody>
                                    <#list industries as industry>
                                        <tr class="${industry?item_cycle("even", "odd")} pointer">
                                            <td class=" ">${industry.id}</td>
                                            <td class=" ">${industry.name}</td>
                                            <td class=" ">${industry.createdAt?datetime} </td>
                                            <td class=" ">
                                                <button class="btn btn-default btn-xs">修改</button>
                                                <button class="btn btn-danger btn-xs">删除</button>
                                            </td>
                                        </tr>
                                    </#list>
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
