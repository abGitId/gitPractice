# gitPractice
Git Practice 11-11-2016

### create branch
go to that branch from where we need to create new branch and use below command:

1. creating branch locally:


```sh
$ git checkout -b <new-branch-name>
```
this will create new branch at local
now the second step to move this local branch to remote repository

2. pushing local branch to remote:
git push --set-upstream origin <new-branch-name>
 
```sh
$ git push --set-upstream origin release/0.0.1
```

### Listing of branch
```sh
$ git branch -a
```
### Delete Branch
- Delete a branch on your local filesystem :
```sh
$ git branch -d [name_of_your_new_branch]
```

- To force the deletion of local branch on your filesystem :
```sh
$ git branch -D [name_of_your_new_branch]
```

- Delete the branch on github :
```sh
$ git push origin :[name_of_your_new_branch]
```

### Reword

- Use the below command to display a list of the last n commits.
git rebase -i HEAD~n 

```sh
$ git rebase -i HEAD~3
```

```sh
pick 491e303 practice | add method added
pick 12bb02d git-command | added git branch related command
pick e621241 git-command | delete branch command added

# Rebase ee4686c..e621241 onto ee4686c (3 commands)
#
# Commands:
# p, pick <commit> = use commit
# r, reword <commit> = use commit, but edit the commit message
# e, edit <commit> = use commit, but stop for amending
# s, squash <commit> = use commit, but meld into previous commit
# f, fixup <commit> = like "squash", but discard this commit's log message
# x, exec <command> = run command (the rest of the line) using shell
# d, drop <commit> = remove commit
# l, label <label> = label current HEAD with a name
# t, reset <label> = reset HEAD to a label
# m, merge [-C <commit> | -c <commit>] <label> [# <oneline>]
# .       create a merge commit using the original merge commit's
# .       message (or the oneline, if no original merge commit was
# .       specified). Use -c <commit> to reword the commit message.
#
# These lines can be re-ordered; they are executed from top to bottom.
#
# If you remove a line here THAT COMMIT WILL BE LOST.
#
#	However, if you remove everything, the rebase will be aborted.
#
#	
# Note that empty commits are commented out
```
- replace the pick with reword which wants update 
```sh
pick 491e303 practice | add method added
reword 12bb02d git-command | added git branch related command
pick e621241 git-command | delete branch command added
```

- save & close the file
- update the commit message in resulting file from above action.

- force push the commits.
```sh
$ git push --force
```

### SQUASH

```sh
$ git rebase -i HEAD~5
```

```sh
pick 4a3f7f4 git-command | delete branch command added
pick e566bfe git-command | reword using git rebase command added in readme file
pick c00f38f git-command | updated readme file format
pick affb1e7 git-command | updated readme file format
pick c4a1c4b git-command | updated readme file format

# Rebase 4d58e45..c4a1c4b onto 4d58e45 (5 commands)
#
# Commands:
# p, pick <commit> = use commit
# r, reword <commit> = use commit, but edit the commit message
# e, edit <commit> = use commit, but stop for amending
# s, squash <commit> = use commit, but meld into previous commit
# f, fixup <commit> = like "squash", but discard this commit's log message
# x, exec <command> = run command (the rest of the line) using shell
# d, drop <commit> = remove commit
# l, label <label> = label current HEAD with a name
# t, reset <label> = reset HEAD to a label
# m, merge [-C <commit> | -c <commit>] <label> [# <oneline>]
# .       create a merge commit using the original merge commit's
# .       message (or the oneline, if no original merge commit was
# .       specified). Use -c <commit> to reword the commit message.
#
# These lines can be re-ordered; they are executed from top to bottom.
#
# If you remove a line here THAT COMMIT WILL BE LOST.
#
#	However, if you remove everything, the rebase will be aborted.
#
#	
# Note that empty commits are commented out

```

- replace pick with squash where we want to do
```sh
pick 4a3f7f4 git-command | delete branch command added
pick e566bfe git-command | reword using git rebase command added in readme file
squash c00f38f git-command | updated readme file format
squash affb1e7 git-command | updated readme file format
squash c4a1c4b git-command | updated readme file format
```
here we are doing for 3 commits .

- then force push changes

```sh
$ git push --force
```
