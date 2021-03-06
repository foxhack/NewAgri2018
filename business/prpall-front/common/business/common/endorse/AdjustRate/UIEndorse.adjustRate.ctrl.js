/**
 * Created by colorfulcat on 2017/11/12.
 */
define(['app', 'constants', 'layer', 'jsonDB'], function (app, constants, layer, jsonDB) {
    'use strict';
    app.registerController('UIEndorseAdjustRateCtrl', ['$rootScope', '$scope', '$$finder', '$http', '$filter', '$state',
        function ($rootScope, $scope, $$finder, $http, $filter, $state) {
           $scope.rateShow=true;
            $scope.Tittle={
                firstLev:'批改管理',
                secLev:'特殊批改查询',
                thirdLev:'调整费率'
            }
            //上一步
            $scope.last = function(){
                $("html,body").css({overflow:"auto"});//出现滚动条
                $state.go('UIproposal3107edit');
            };
            //下一步
            $scope.next = function(){

            };
            //查看详情
            $scope.totalItems = 0;
            $scope.showDetail = false;
            $scope.choosedDetail = function(){
                //查询保单列表信息
                $$finder.find('selectedGuaranteeDetails', {}, {
                    success: function(data) {
                        if(data.code="0000"){
                            $scope.details = data.data.resultObj.content;
                            $scope.totalItems = $scope.details.length;
                            $scope.paginationConfmm.totalItems = $scope.totalItems;
                            $scope.showDetail = true;
                        }
                    }
                });
            }
            //关闭详情页面
            $scope.cancel = function(){
                $scope.showDetail = false;
            }
            //分页设置
            var initPage2 = function() {
                $scope.paginationConfmm = {
                    currentPage: 1,
                    totalItems: 0,
                    itemsPerPage: 20,
                    pagesLength: 5,
                    perPageOptions: [5, 10, 20, 50]
                };
            };
            initPage2();
            $scope.paginationConfmm.totalItems = $scope.totalItems;
        }]);


});