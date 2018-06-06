<!DOCTYPE html>
<html lang="en">
    <head>
	    <meta charset="UTF-8"/>
		<title>用户列表</title>
        <link href="components/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
        <link href="components/jquery/buttons/css/buttons.dataTables.min.css" rel="stylesheet"/>
		<link href="components/jquery/dataTables/css/dataTables.bootstrap.min.css" rel="stylesheet"/>
		<script type="text/javascript" src="components/jquery/jquery.min.js"></script>
        <script type="text/javascript" src="components/font-awesome/js/fontawesome-all.min.js"></script>
		<script type="text/javascript" src="components/jquery/jquery.dataTables.min.js"></script>
        <script type="text/javascript" src="components/jquery/dataTables/js/dataTables.buttons.min.js"></script>
		<script type="text/javascript" src="components/jquery/dataTables/js/dataTables.bootstrap.min.js"></script>
        <script type="text/javascript" src="components/jquery/buttons/js/buttons.bootstrap.min.js"></script>
        <script type="text/javascript" src="components/jquery/buttons/js/buttons.colVis.min.js"></script>
        <script type="text/javascript" src="components/jquery/buttons/js/buttons.html5.min.js"></script>
        <script type="text/javascript" src="components/jquery/buttons/js/buttons.print.min.js"></script>
        <script type="text/javascript" src="components/jquery/jszip.min.js"></script>
        <script type="text/javascript" src="components/jquery/pdfmake.min.js"></script>
        <script type="text/javascript" src="components/jquery/vfs_fonts.js"></script>
		<script type="text/javascript">
            $(document).ready(function() {
                $('#example').DataTable({
                    "bProcessing": false, //DataTables载入数据时，是否显示‘进度’提示
                    "bServerSide": false, //是否启动服务器端数据导入
                    "bStateSave": false, //是否打开客户端状态记录功能,此功能在ajax刷新纪录的时候不会将个性化设定回复为初始化状态
                    "bDeferRender": true,//是否延迟渲染
                    "iDisplayLength": 4, //默认显示的记录数
                    "bLengthChange": false, //每页记录数选择
                    "bAutoWidth": true, //是否自适应宽度
                    "bScrollCollapse": true, //是否开启DataTables的高度自适应，当数据条数不够分页数据条数的时候，插件高度是否随数据条数而改变
                    "bPaginate": true, //是否显示（应用）分页器
                    "bInfo": true, //是否显示页脚信息，DataTables插件左下角显示记录数
                    "sPaginationType": "full_numbers", //详细分页组，可以支持直接跳转到某页
                    "bSort": true, //是否启动各个字段的排序功能
                    "aaSorting": [[1, "asc"]], //默认的排序方式，第2列，升序排列
                    "bFilter": true, //是否启动过滤、搜索功能
                    "sScrollX": "100%", //表格宽度
                    "sScrollXInner": "100%", //表格内容宽度
                    "asStripeClasses": [ 'odd', 'even'],
                    "dom": "<'toolbar'><'top'f>t<'bottom'ip>",
                    "aoColumns": [
                        {
                            "mDataProp": "id",
                            "sTitle": "ID",
                            "sDefaultContent": "", //此列默认值为""，以防数据中没有此值，DataTables加载数据的时候报错
                            "bVisible": false //此列不显示
                        },
                        {
                            "mDataProp": "userNo",
                            "sTitle": "用户编号",
                            "sDefaultContent": "",
                            "sClass": "center"
                        },
                        {
                            "mDataProp": "userName",
                            "sTitle": "用户名",
                            "sDefaultContent": "",
                            "sClass": "center"
                        },
                        {
                            "mDataProp": "userPass",
                            "sTitle": "密码",
                            "sDefaultContent": "",
                            "sClass": "center"
                        },
                        {
                            "mDataProp": "sex",
                            "sTitle": "性别",
                            "sDefaultContent": "",
                            "sClass": "center"
                        },
                        {
                            "mDataProp": "age",
                            "sTitle": "年龄",
                            "sDefaultContent": "",
                            "sClass": "center"
                        },
                        {
                            "mDataProp": "phone",
                            "sTitle": "联系电话",
                            "sDefaultContent": "",
                            "sClass": "center"
                        },
                        {
                            "mDataProp": "address",
                            "sTitle": "家庭地址",
                            "sDefaultContent": "",
                            "sClass": "center"
                        },
                        {
                            "sTitle": "操作",
                            "bSortable": false,
                            "sDefaultContent": "",
                            render: function() {
                                return[
                                    '<button id="TableEditor" type="button" class="btn btn-warning btn-xs"><i class="fas fa-xs fa-edit"></i></button>&nbsp;&nbsp;&nbsp;'+
                                    '<button id="TableDelete" type="button" class="btn btn-danger btn-xs"><i class="fas fa-xs fa-trash"></i></button>'
                                ]
                            }
                        }
                    ],
                    "oLanguage": {
                        "sProcessing": "正在获取数据，请稍后...",
                        "sLoadingRecords": "正在加载，请稍后...",
                        "sLengthMenu": "显示 _MENU_ 条",
                        "sZeroRecords": "没有您要搜索的内容",
                        "sEmptyTable": "表格中没有数据",
                        "sInfo": "总共_PAGES_页，显示第 _START_ 到 _END_ 条，筛选之后得到 _TOTAL_ 条，初始 _MAX_ 条",
                        "sInfoEmpty": "记录数为0",
                        "sInfoFiltered": "(全部记录数 _TOTAL_ 条)",
                        "sInfoPostFix": "",
                        "sSearch": '<i class="fas fa-search"></i>',
                        "sUrl": "",
                        "oPaginate": {
                            "sFirst": "&laquo;",
                            "sPrevious": "&lsaquo;",
                            "sNext": "&rsaquo;",
                            "sLast": "&raquo;"
                        },
                        "oAria": {
                            "sSortAscending":  ": 以升序排列此列",
                            "sSortDescending": ": 以降序排列此列"
                        }
                    },
                    "sAjaxSource": "/users/all" //请求资源路径
                });
                $("div.toolbar").html("<div class='col-md-3 col-sm-4'><button class='btn btn-default btn-sm' id='btn_add' data-toggle='modal' data-target='#addModal'><i class='fa fa-fw fa-user-plus'></i></button> 添加管理员</div>");
            });
        </script>
    </head>

    <body>
        <div style="padding:20px 60px">
			<table id="example" class="table table-striped table-bordered table-hover table-condensed">
			</table>
        </div>
        <!-------添加的模糊框----->
        <form class="form-horizontal">   <!--保证样式水平不混乱-->
            <!-- 模态框（Modal） -->
            <div class="modal fade" id="addModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                &times;
                            </button>
                            <h4 class="modal-title" id="myModalLabel">
                                添加新管理员
                            </h4>
                        </div>
                        <div class="modal-body">

                            <!---------------------表单-------------------->
                            <div class="form-group">
                                <label for="firstname" class="col-sm-3 control-label">用户名</label>
                                <div class="col-sm-7">
                                    <input type="text" class="form-control" id="addUsername"  placeholder="请输入管理员用户名">
                                    <label class="control-label" for="addUsername" style="display:none;"></label>
                                </div>
                            </div>


                            <div class="form-group">
                                <label for="firstname" class="col-sm-3 control-label">真实姓名</label>
                                <div class="col-sm-7">
                                    <input type="text" class="form-control" id="addName"  placeholder="请输入管理员真实姓名">
                                    <label class="control-label" for="addName" style="display:none;"></label>
                                </div>
                            </div>


                            <div class="form-group">
                                <label for="firstname" class="col-sm-3 control-label">联系电话</label>
                                <div class="col-sm-7">
                                    <input type="text" class="form-control" id="addPhone"  placeholder="请输入管理员联系电话">
                                    <label class="control-label" for="addPhone" style="display:none;"></label>
                                </div>
                            </div>
                            <!---------------------表单-------------------->
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal"><i class="fa fa-close"></i>关闭
                            </button>
                            <button type="button" class="btn btn-primary" id="addAdmin"><i class="fa fa-save"></i>
                                保存
                            </button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal -->
            </div>

        </form>
    </body>
</html>