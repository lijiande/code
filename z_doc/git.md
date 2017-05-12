# git 命令备忘

1. git 全局变量配置   

````
$ git config --global user.name "github's Name"
$ git config --global user.email "github@xx.com"
$ git config --list
````
2. git 局部变量配置

````
$ git config user.name "github's Name"
$ git config user.email "github@xx.com"
$ git config --list
````

3. 上传本地代码到github

- 在github创建仓库
- 增加`.gitignore`文件到根目录
- 本地项目文件夹内初始化git：`$ git init`
- 修改`user.name` 和`user.email`(非必须)
- 绑定github 的`url`,`$git remote add origin [url]`
- 更新代码至本地，`$ git pull`
- 处理冲突代码(有则改之)
- 检查一下`$ git status`
- 增加到暂存区`$ git add [dir/file/.]`
- 提交暂存到本地仓库`$ git commit -m "message"`
- 提交到远程仓库`$ git push origin master`

4. 增加到暂存
- 增加文件`$ git add [file]`
- 增加目录`$ git add [dir]`
- 增加所有`$ git add .`

5. 恢复`$ git add .` 的文件
- 恢复所有`$ git reset HEAD`
- 恢复指定文件`$ git reset HEAD [file]`或`$ git reset [file]`
- 恢复指定文件夹`$ git reset HEAD [dir]`或`$ git reset [dir]`

6. 
- git branch --set-upstream-to origin/master master