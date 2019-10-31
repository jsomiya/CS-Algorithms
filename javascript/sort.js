// 比较排序
function compared1(value1,value2){
    if (value1 > value2) {
        return 1;
    }else if (value1 < value2) {
        return -1
    }else {
        return 0
    }
}
// 根据属性的比较排序
function compared2(property){
    return function(a,b){
        let value1 = a[property];
        let value2 = b[property];
        return value2 - value1;
    }
}
array.sort(compared('property'));
// 冒泡排序
for(let i=0;i<arr.length;i++){
    let mix = arr[i];
    for(let j=i+1;j<arr.length;j++){
        if(mix>arr[j]){
            [arr[i],arr[j]] = [arr[j],arr[i]];//交换相邻值
        }
    }
}
// 选择排序
let len = arr.length;
for(let i=0;i<len;i++){
    let maxIndex = i;
    for(let j=0;j<len-i;j++){
        if(arr[maxIndex]<arr[j]){
            maxIndex = j;//记录最大值索引
        }
    }
    [arr[len-1-i],arr[maxIndex]] = [arr[maxIndex],arr[len-1-i]];//调整最大值位置
}